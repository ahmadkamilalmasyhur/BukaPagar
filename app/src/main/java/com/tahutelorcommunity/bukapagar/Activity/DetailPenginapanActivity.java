package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Model.Penginapan.Penginapan;
import com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct.Product;
import com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct.Product_;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DetailPenginapanActivity extends AppCompatActivity {
    TextView name, stock, address, price, description;
    CheckBox cbAc, cbHotwater, cbBreakfast, cbTv, cbWifi;
    private DatabaseReference mDatabase;
    ViewFlipper viewFlipper;
    Toolbar toolbar;

    private final String TAG = "DetailPenginapan";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_penginapan);

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Detail Penginapan");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        String productId = getIntent().getStringExtra("productId");
        getProduct(productId);
        name = (TextView) findViewById(R.id.name);
        stock = (TextView) findViewById(R.id.stock);
        address = (TextView) findViewById(R.id.address);
        price = (TextView) findViewById(R.id.price);
        description = (TextView) findViewById(R.id.description);

        cbAc = (CheckBox) findViewById(R.id.cbAc);
        cbHotwater = (CheckBox) findViewById(R.id.cbHotwater);
        cbBreakfast = (CheckBox) findViewById(R.id.cbBreakfast);
        cbTv = (CheckBox) findViewById(R.id.cbTv);
        cbWifi = (CheckBox) findViewById(R.id.cbWifi);

        viewFlipper = (ViewFlipper) findViewById(R.id.flipper);
    }

    private void setFlipperImage(String s) {
        ImageView image = new ImageView(getApplicationContext());
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Picasso.with(DetailPenginapanActivity.this).load(s).placeholder(ContextCompat.getDrawable(DetailPenginapanActivity.this, R.drawable.noimage))
                .into(image);
        viewFlipper.addView(image);
    }

    public void getProduct(final String pid) {
        Request loginService =
                ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        Call<Product> call = loginService.getReadProducts("products/" + pid + ".json");
        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                if (response.isSuccessful()) {
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Toast.makeText(DetailPenginapanActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        Product productResponse = response.body();
                        Product_ product = productResponse.getProduct();
                        name.setText(product.getName().substring(12));
                        stock.setText(String.valueOf(product.getStock()));
                        address.setText(product.getCity());
                        price.setText(String.valueOf(product.getPrice()) + " / malam");
                        description.setText(product.getDesc());

                        List<String> images = product.getImages();
                        int size = images.size();

                        for (int i = 0; i < size; i++) {
                            setFlipperImage(images.get(i));
                        }

                        DatabaseReference dbref = mDatabase.child(product.getId());
                        dbref.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                try {
                                    Penginapan penginapan = dataSnapshot.getValue(Penginapan.class);

                                    if (penginapan.getAc() == true) {
                                        cbAc.setChecked(true);
                                    }
                                    if (penginapan.getHotwater() == true) {
                                        cbHotwater.setChecked(true);
                                    }
                                    if (penginapan.getBreakfast() == true) {
                                        cbBreakfast.setChecked(true);
                                    }
                                    if (penginapan.getTv() == true) {
                                        cbTv.setChecked(true);
                                    }
                                    if (penginapan.getWifi() == true) {
                                        cbWifi.setChecked(true);
                                    }

                                } catch (Exception e) {
                                    Penginapan penginapan = dataSnapshot.getValue(Penginapan.class);

                                    cbAc.setChecked(false);
                                    cbHotwater.setChecked(false);
                                    cbBreakfast.setChecked(false);
                                    cbTv.setChecked(false);
                                    cbWifi.setChecked(false);

                                }

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    }
                } else {
                    Log.d(TAG, "" + response.toString());
                    Toast.makeText(DetailPenginapanActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                // something went completely south (like no internet connection)
                Log.d(TAG, t.getMessage());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }
}
