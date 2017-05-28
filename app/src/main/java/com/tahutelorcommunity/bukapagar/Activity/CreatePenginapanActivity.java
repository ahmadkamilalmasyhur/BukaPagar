package com.tahutelorcommunity.bukapagar.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.ImageResponse.Image;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Model.Penginapan.Penginapan;
import com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest.CreateRequest;
import com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest.ProductDetailAttributes;
import com.tahutelorcommunity.bukapagar.Model.Products.CreateProductResponse.ProductsCreate;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;
import com.tahutelorcommunity.bukapagar.Utils.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreatePenginapanActivity extends AppCompatActivity {
    DatabaseReference dbref = FirebaseDatabase.getInstance().getReference();
    EditText room_name, room_description, room_capacity, room_price;
    CheckBox cbAc, cbHotwater, cbTv, cbWifi, cbBreakfast;
    ImageView image1, image2, image3, image4, image5;
    String[] imageid = new String[5];
    private final String TAG = "CreatePenginapan";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_penginapan);

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Buat Penginapan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        int permission = ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    1
            );
        }

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        image5 = (ImageView) findViewById(R.id.image5);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testAPIUploadImage(1);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testAPIUploadImage(2);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testAPIUploadImage(3);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testAPIUploadImage(4);
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testAPIUploadImage(5);
            }
        });
        room_name = (EditText) findViewById(R.id.room_name);
        room_description = (EditText) findViewById(R.id.room_description);
        room_capacity = (EditText) findViewById(R.id.room_capacity);
        room_price = (EditText) findViewById(R.id.room_price);

        cbAc = (CheckBox) findViewById(R.id.checkBoxAc);
        cbHotwater = (CheckBox) findViewById(R.id.checkBoxHotwater);
        cbTv = (CheckBox) findViewById(R.id.checkBoxTv);
        cbWifi = (CheckBox) findViewById(R.id.checkBoxWifi);
        cbBreakfast = (CheckBox) findViewById(R.id.checkBoxBreakfast);
    }

    public void testAPIUploadImage(int request) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), request);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_submit, menu);
        return true;
    }

    public void submitPenginapan(MenuItem menu) {
        //Pertama buat penginapan
        final String name, description, price;
        final int capacity;
        final boolean ac, hotwater, tv, wifi, breakfast;

        try {
            name = room_name.getText().toString();
            description = room_description.getText().toString();
            capacity = Integer.valueOf(room_capacity.getText().toString());
            price = room_price.getText().toString();

            ac = cbAc.isEnabled();
            hotwater = cbHotwater.isEnabled();
            tv = cbTv.isEnabled();
            wifi = cbWifi.isEnabled();
            breakfast = cbBreakfast.isEnabled();
        } catch (Exception e) {
            Toast.makeText(this, "Kesalahan Saat Kirim Data, Data Tidak Lengkap", Toast.LENGTH_SHORT).show();
            return;
        }

        Request service = ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 2);
        ProductDetailAttributes pda = new ProductDetailAttributes("Roadbike", "Polygon", "1", "Cromoly", "bukalapak_app");
        com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest.Product product =
                new com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest.Product(
                        "174", "BKPGFIKGNTG " + name, "true", price, "false", "10", "5", description, list,
                        pda
                );
        //Khusus Pencarian Kata Kunci Nantinya Bisa Menggunakan BKPGFIKGNTG diawal
        TextUtils.join(",", imageid);
        CreateRequest cr = new CreateRequest(product, TextUtils.join(",", imageid), "");
        Call<ProductsCreate> call = service.CreateProducts(cr);
        call.enqueue(new Callback<ProductsCreate>() {
            @Override
            public void onResponse(Call<ProductsCreate> call,
                                   Response<ProductsCreate> response) {
                Log.v(TAG, "" + response.body().getMessage());
                Log.v(TAG, "" + response.body().getStatus());
                Log.v(TAG, "" + response.body().getId());
                if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                    Toast.makeText(CreatePenginapanActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    Penginapan penginapan = new Penginapan(response.body().getProductDetail().getId(), name
                            , "jl.ini lo alamatnya", description
                            , capacity, ac, hotwater, breakfast, tv, wifi,
                            -33.865143, 151.209900, 50000.0, new Date().getTime(), userLogin.getUserId());
                    dbref.child(response.body().getProductDetail().getId()).setValue(penginapan);
                }

            }

            @Override
            public void onFailure(Call<ProductsCreate> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onActivityResult(final int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            final Uri uri = data.getData();
            Request service =
                    ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
            File file = FileUtil.getFile(this, uri);
            // create RequestBody instance from file
            RequestBody requestFile =
                    RequestBody.create(
                            MediaType.parse(getContentResolver().getType(uri)),
                            file
                    );
            // MultipartBody.Part is used to send also the actual file name
            MultipartBody.Part body =
                    MultipartBody.Part.createFormData("file", file.getName(), requestFile);

            Call<Image> call = service.upload(body);
            call.enqueue(new Callback<Image>() {
                @Override
                public void onResponse(Call<Image> call,
                                       Response<Image> response) {
                    Log.v(TAG, "" + response.body().getMessage());
                    Log.v(TAG, "" + response.body().getStatus());
                    Log.v(TAG, "" + response.body().getId());//first id = 1258920677
                    imageid[requestCode] = response.body().getId();
                    switch (requestCode) {
                        case 1:
                            image1.setImageURI(uri);
                            break;
                        case 2:
                            image2.setImageURI(uri);
                            break;
                        case 3:
                            image3.setImageURI(uri);
                            break;
                        case 4:
                            image4.setImageURI(uri);
                            break;
                        case 5:
                            image5.setImageURI(uri);
                            break;
                    }
                }

                @Override
                public void onFailure(Call<Image> call, Throwable t) {
                    Log.e(TAG, t.getMessage());
                }
            });
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            this.finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }
}
