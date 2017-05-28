package com.tahutelorcommunity.bukapagar.Auth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Model.Users.PasswordReset.PasswordReset;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText inputEmail;
    private Button btnReset;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ubah Password");
        inputEmail = (EditText) findViewById(R.id.reset_edt_email);
        btnReset = (Button) findViewById(R.id.reset_btn_reset_password);
        progressBar = (ProgressBar) findViewById(R.id.reset_pass_progressBar);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
                String email = inputEmail.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplication(), getResources().getString(R.string.recheck_email), Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                doReset(email);
            }
        });
    }

    public void doReset(String email) {
        Request request = ServiceGenerator.createService(Request.class);
        Call<PasswordReset> call = request.doResetPassword("email=" + email);
        call.enqueue(new Callback<PasswordReset>() {
            @Override
            public void onResponse(Call<PasswordReset> call, Response<PasswordReset> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful()) {
                    Log.d("MainActivity", "" + response.toString());
                    Toast.makeText(ResetPasswordActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    Log.d("MainActivity", "" + response.toString());
                    Toast.makeText(ResetPasswordActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<PasswordReset> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                try {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(ResetPasswordActivity.this, "Error : " + t.getMessage(), Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(ResetPasswordActivity.this, "Telah Terjadi Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
