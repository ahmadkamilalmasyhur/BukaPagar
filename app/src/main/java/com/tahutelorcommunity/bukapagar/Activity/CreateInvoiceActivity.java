package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse.Carts;
import com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice.PaymentInvoice;
import com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice.RequestInvoice;
import com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice.TransactionsAttribute;
import com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice.ResponseInvoice;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CreateInvoiceActivity extends AppCompatActivity {
    String product_id;
    int product_price;
    Button btnPay;
    EditText edt_name, edt_duration;
    TextView txtPrice;
    private final String TAG = "CreateInvoiceActivity";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_invoice);

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        product_id = getIntent().getStringExtra("product_id");
        product_price = getIntent().getIntExtra("product_price", 1);
        edt_name = (EditText) findViewById(R.id.name);
        edt_duration = (EditText) findViewById(R.id.duration);
        txtPrice = (TextView) findViewById(R.id.price);

        edt_duration.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                double duration = Double.valueOf(charSequence.toString());
                try {
                    double price = product_price * duration;
                    txtPrice.setText(String.valueOf(price));
                } catch (Exception e) {
                    txtPrice.setText("Atur durasi penginapan");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        btnPay = (Button) findViewById(R.id.btnPay);
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Request loginService =
                        ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
                Call<Carts> call = loginService.addToCart("carts/add_product/" + product_id + ".json");
                call.enqueue(new Callback<Carts>() {
                    @Override
                    public void onResponse(Call<Carts> call, Response<Carts> response) {
                        if (response.isSuccessful()) { // seller sebagai UUID Login
                            if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                                Toast.makeText(CreateInvoiceActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();


                            } else {
                                Toast.makeText(CreateInvoiceActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                                final RequestInvoice requestInvoice = new RequestInvoice();
                                PaymentInvoice paymentInvoice = new PaymentInvoice();

                                List<TransactionsAttribute> tra = new ArrayList<TransactionsAttribute>();
                                TransactionsAttribute transactionsAttribute = new TransactionsAttribute();
                                transactionsAttribute.setCourier("SiCepat REG");
                                transactionsAttribute.setBuyerNotes(" - ");

                                List<Integer> itemId = new ArrayList<>();
                                itemId.add(1);
                                transactionsAttribute.setSellerId(response.body().getCart().get(0).getSeller().getId());
                                transactionsAttribute.setItemIds(itemId);
                                tra.add(transactionsAttribute);

                                com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice.Address address = new com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice.Address();
                                address.setAddress("Jl. Terserah");
                                address.setArea("Mampang Prapatan");
                                address.setCity("Malang");
                                address.setPostCode("65145");
                                address.setProvince("Jawa Timur");

                                paymentInvoice.setAddress(address);
                                paymentInvoice.setPhone("081331486954");
                                paymentInvoice.setShippingName("Kamil");
                                paymentInvoice.setTransactionsAttributes(tra);

                                requestInvoice.setCartId(response.body().getCartId());
                                requestInvoice.setPaymentMethod("deposit");
                                requestInvoice.setPaymentInvoice(paymentInvoice);

                                Request loginService =
                                        ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
                                Call<ResponseInvoice> call1 = loginService.createInvoice(requestInvoice.toString());
                                call1.enqueue(new Callback<ResponseInvoice>() {
                                    @Override
                                    public void onResponse(Call<ResponseInvoice> call, Response<ResponseInvoice> response) {
                                        if (response.isSuccessful()) {
                                            if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                                                Toast.makeText(CreateInvoiceActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();


                                            } else {
                                                Toast.makeText(CreateInvoiceActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                                            }
                                        } else {
                                            Toast.makeText(CreateInvoiceActivity.this, "" + response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    }

                                    @Override
                                    public void onFailure(Call<ResponseInvoice> call, Throwable t) {
                                        Toast.makeText(CreateInvoiceActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                                    }
                                });
                            }

                        } else {
                            Log.d(TAG, "" + response.toString());
                            Toast.makeText(CreateInvoiceActivity.this, response.message(), Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<Carts> call, Throwable t) {
                        Log.d(TAG, "" + t.getMessage());
                        Toast.makeText(CreateInvoiceActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
