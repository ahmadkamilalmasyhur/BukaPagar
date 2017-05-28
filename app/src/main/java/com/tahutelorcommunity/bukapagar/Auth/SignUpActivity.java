package com.tahutelorcommunity.bukapagar.Auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Users.Register.Register;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword, inputRetypePassword, inputUsername, inputNamaLengkap;
    private EditText provinsi, kota, area, alamat, kode_pos;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private String jenisKelamin;
    private LinearLayout laki, perempuan;
    private ProgressBar progressBar;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Daftar");
        session = new SessionManager(this);

        btnSignIn = (Button) findViewById(R.id.register_sign_in_button);
        btnSignUp = (Button) findViewById(R.id.sign_up_button);
        inputEmail = (EditText) findViewById(R.id.register_txv_email);
        inputPassword = (EditText) findViewById(R.id.register_txv_password);
        inputRetypePassword = (EditText) findViewById(R.id.register_txv_retype_password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnResetPassword = (Button) findViewById(R.id.register_btn_reset_password);
        inputUsername = (EditText) findViewById(R.id.register_txv_username);
        inputNamaLengkap = (EditText) findViewById(R.id.register_txv_nama_lengkap);
        provinsi = (EditText) findViewById(R.id.register_txv_province);
        kota = (EditText) findViewById(R.id.register_txv_city);
        area = (EditText) findViewById(R.id.register_txv_area);
        alamat = (EditText) findViewById(R.id.register_txv_address);
        kode_pos = (EditText) findViewById(R.id.register_txv_post_code);

        laki = (LinearLayout) findViewById(R.id.register_imv_laki);
        perempuan = (LinearLayout) findViewById(R.id.register_imv_perempuan);

        laki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jenisKelamin = "Laki-laki";
            }
        });

        perempuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jenisKelamin = "perempuan";
            }
        });

        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, ResetPasswordActivity.class));
                finish();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                final String nama = inputNamaLengkap.getText().toString().trim();
                final String email = inputEmail.getText().toString().trim();
                final String username = inputUsername.getText().toString().trim();
                final String password = inputPassword.getText().toString().trim();
                final String retype = inputRetypePassword.getText().toString().trim();
                final String provinsi1 = provinsi.getText().toString().trim();
                final String kota1 = kota.getText().toString().trim();
                final String area1 = area.getText().toString().trim();
                final String alamat1 = alamat.getText().toString().trim();
                final String kodePos1 = kode_pos.getText().toString().trim();

                if (TextUtils.isEmpty(nama)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Nama", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Email", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Username", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Password", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(retype)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Retype Password", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(provinsi1)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Provinsi", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(kota1)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Kota", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(area1)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Kecamatan", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(alamat1)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Alamat", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (TextUtils.isEmpty(kodePos1)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Kode Pos", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Panjang Minimal Untuk Password Adalah 6 Karakter", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }

                doRegister(nama, email, username, password, retype, provinsi1, kota1, area1, alamat1, kodePos1);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }


    public void doRegister(String nama, String email, String username,
                           String password, String retype, String provinsi1,
                           String kota1, String area1, String alamat1, String kodePos1) {
        Request request = ServiceGenerator.createService(Request.class);
        Call<Register> call = request.doRegister(
                ("user[name]=" + nama),
                ("user[email]=" + email),
                ("user[username]=") + username,
                ("user[password]=") + password,
                ("user[password_confirmation]=") + retype,
                ("user[policy]=1"),
                ("user[gender]=")+ jenisKelamin,
                ("user[address_attributes][province]=") + provinsi1,
                ("user[address_attributes][city]=") + kota1,
                ("user[address_attributes][area]=") + area1,
                ("user[address_attributes][address]=") + alamat1,
                ("user[address_attributes][post_code]=") + kodePos1

        );
        call.enqueue(new Callback<Register>() {
            @Override
            public void onResponse(Call<Register> call, Response<Register> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful()) {
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")){
                        Log.d("MainActivity", "" + response.toString());
                        Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        Log.d("MainActivity", "" + response.toString());
                        Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                        session.createLoginSession(inputEmail.getText().toString().trim(),
                                inputPassword.getText().toString().trim());
                        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    Log.d("MainActivity", "" + response.toString());
                    Toast.makeText(SignUpActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Register> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                try {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(SignUpActivity.this, "Error : " + t.getMessage(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(SignUpActivity.this, "Telah Terjadi Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
