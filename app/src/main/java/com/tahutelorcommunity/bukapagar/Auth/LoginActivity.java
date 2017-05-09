package com.tahutelorcommunity.bukapagar.Auth;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.GlobalData;
import com.tahutelorcommunity.bukapagar.MainApps.CobaCobaActivity;
import com.tahutelorcommunity.bukapagar.Manager.UserManager;
import com.tahutelorcommunity.bukapagar.R;


public class LoginActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    //    private FirebaseAuth auth;
    private Button btnSignup, btnLogin, btnReset;
    private LinearLayout loginFacebook, loginGoogle;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        progressBar = (ProgressBar) findViewById(R.id.login_progressBar);
        inputEmail = (EditText) findViewById(R.id.login_txv_email);
        inputPassword = (EditText) findViewById(R.id.login_txv_password);
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

//        auth = FirebaseAuth.getInstance();

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
                final String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                new loginAuth().execute(email,password);

                //authenticate user
//                auth.signInWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if (!task.isSuccessful()) {
//                                    if (password.length() < 6) {
//                                        inputPassword.setError(getString(R.string.minimum_password));
//                                    } else {
//                                        Toast.makeText(LoginActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
//                                    }
//                                } else {
//                                    checkIfEmailVerified();
//                                }
//                            }
//                        });
            }
        });
    }

    private void checkIfEmailVerified() {
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//
//        if (user.isEmailVerified()) {
//            // user is verified, so you can finish this activity or send user to activity which you want.
////            GlobalData.uuid_user = user.getUid();
////            GlobalData.email = user.getEmail();
////            Intent intent = new Intent(LoginActivity.this, MainAppsActivity.class);
////            startActivity(intent);
//            progressBar.setVisibility(View.GONE);
//            Toast.makeText(LoginActivity.this, "Successfully logged in", Toast.LENGTH_SHORT).show();
//            LoginActivity.this.finish();
//        } else {
//            // email is not verified, so just prompt the message to the user and restart this activity.
//            // NOTE: don't forget to log out the user.
//            progressBar.setVisibility(View.GONE);
//            FirebaseAuth.getInstance().signOut();
//            Toast.makeText(this, "You Cannot Logged in, Please Check Your Email for Verification", Toast.LENGTH_SHORT).show();
//            //restart this activity
//        }
    }

    class loginAuth extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... params) {
            return new UserManager().doBasicAuth(params[0],params[1]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            progressBar.setVisibility(View.GONE);
            Log.d("LoginActivity",""+s);
            if (s != null && GlobalData.userLogin != null){
                if (s.equalsIgnoreCase("success")){
                    Toast.makeText(LoginActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                    //Then Intent to Main Activity
                    Intent intent = new Intent(LoginActivity.this, CobaCobaActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, s, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
