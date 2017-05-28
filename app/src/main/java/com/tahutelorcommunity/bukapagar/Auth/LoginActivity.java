package com.tahutelorcommunity.bukapagar.Auth;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
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

import com.tahutelorcommunity.bukapagar.Activity.PencarianRumahActivity;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.GlobalApplication;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Authenticate.Login.User;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.LocationTrackingManager;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    private Button btnSignup, btnLogin, btnReset;
    private LinearLayout loginFacebook, loginGoogle;
    private ProgressBar progressBar;
    SessionManager session;

    private final int MY_REQUEST_CODE = 12589;

    private void cekPermission() {
        if (ActivityCompat.checkSelfPermission(getBaseContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(getBaseContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(getBaseContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_REQUEST_CODE);
            }
            return;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Masuk");
        session = new SessionManager(this);
        cekPermission();
        if (session.isLoggedIn()) {
            goToPencarianRumah();
        } else {
            HashMap<String, String> user = session.getUserDetails();
            String email = user.get(SessionManager.KEY_EMAIL);
            String password = user.get(SessionManager.KEY_PASSWORD);

            progressBar = (ProgressBar) findViewById(R.id.login_progressBar);
            inputEmail = (EditText) findViewById(R.id.login_txv_email);
            inputEmail.setText(email);
            inputPassword = (EditText) findViewById(R.id.login_txv_password);
            inputPassword.setText(password);
            btnSignup = (Button) findViewById(R.id.login_btn_signup);
            btnLogin = (Button) findViewById(R.id.login_btn_login);
            btnReset = (Button) findViewById(R.id.login_btn_reset_password);

            loginFacebook = (LinearLayout) findViewById(R.id.login_btn_login_facebook);
            loginFacebook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LoginActivity.this, "Akan Segera Tersedia", Toast.LENGTH_SHORT).show();
                }
            });
            loginGoogle = (LinearLayout) findViewById(R.id.login_btn_login_google);
            loginGoogle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LoginActivity.this, "Akan Segera Tersedia", Toast.LENGTH_SHORT).show();
                }
            });

            btnSignup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LoginActivity.this, SignUpActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                }
            });

            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(LoginActivity.this, ResetPasswordActivity.class));
                }
            });

            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressBar.setVisibility(View.VISIBLE);
                    final String email = inputEmail.getText().toString();
                    final String password = inputPassword.getText().toString();

                    if (TextUtils.isEmpty(email)) {
                        Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                        return;
                    }

                    if (TextUtils.isEmpty(password)) {
                        Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.GONE);
                        return;
                    }
                    doLogin(email, password);
                }
            });
        }
    }


    public void doLogin(String email, String password) {
        Request loginService =
                ServiceGenerator.createService(Request.class, email, password);
        Call<User> call = loginService.doBasicLogin();
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful()) {
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Log.d("MainActivity", "" + response.toString());
                        Toast.makeText(LoginActivity.this, "" + response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {

                        User user = response.body();
                        final DbHandler dbHandler = new DbHandler(getApplicationContext());
                        dbHandler.addUser(user);
                        session.createLoginSession(user.getUserName(), user.getEmail());
                        GlobalApplication.getReference().setUserLogin(dbHandler.getAllUser().get(0));
                        try {
                            LocationTrackingManager ltm = new LocationTrackingManager(getApplicationContext());
                            ltm.getLastLocation();
                        } catch (Exception e) {
                        }
                        goToPencarianRumah();
                    }
                } else {
                    Log.d("MainActivity", "" + response.toString());
                    Toast.makeText(LoginActivity.this, "Login Failed " + response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // something went completely south (like no internet connection)
                progressBar.setVisibility(View.GONE);
                Log.d("Error", t.getMessage());
            }
        });
    }

    private void goToPencarianRumah() {
        Intent intent = new Intent(LoginActivity.this, PencarianRumahActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MY_REQUEST_CODE:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
