package com.tahutelorcommunity.bukapagar.Auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.R;

public class SignUpActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword, inputUsername, inputNamaLengkap;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private String jenisKelamin = null;
    private LinearLayout laki, perempuan;
    private ProgressBar progressBar;
//    private FirebaseAuth auth;
//    private FirebaseAuth.AuthStateListener authListener;
//    private DatabaseReference mDatabase;
//    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Get Firebase auth instance
//        auth = FirebaseAuth.getInstance();

        btnSignIn = (Button) findViewById(R.id.register_sign_in_button);
        btnSignUp = (Button) findViewById(R.id.sign_up_button);
        inputEmail = (EditText) findViewById(R.id.register_txv_email);

        inputPassword = (EditText) findViewById(R.id.register_txv_password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnResetPassword = (Button) findViewById(R.id.register_btn_reset_password);
        inputUsername =(EditText) findViewById(R.id.register_txv_username);
        inputNamaLengkap = (EditText) findViewById(R.id.register_txv_nama_lengkap);

        laki = (LinearLayout) findViewById(R.id.register_imv_laki);
        perempuan = (LinearLayout) findViewById(R.id.register_imv_perempuan);

        laki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jenisKelamin = "laki-laki";
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
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email = inputEmail.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Alamat Email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Masukkan Password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Panjang Minimal Untuk Password Adalah 6 Karakter", Toast.LENGTH_SHORT).show();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                //create user
//                auth.createUserWithEmailAndPassword(email, password)
//                        .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                Toast.makeText(SignUpActivity.this, "Berhasil Membuat Akun Anda", Toast.LENGTH_SHORT).show();
//                                progressBar.setVisibility(View.GONE);
//                                // If sign in fails, display a message to the user. If sign in succeeds
//                                // the auth state listener will be notified and logic to handle the
//                                // signed in user can be handled in the listener.
//                                if (!task.isSuccessful()) {
//                                    Toast.makeText(SignUpActivity.this, "Gagal Membuat Akun Anda", Toast.LENGTH_SHORT).show();
//                                } else {
//                                    mDatabase = FirebaseDatabase.getInstance().getReference();
////                                    UserController uc = new UserController();
////                                    User user = new User(auth.getCurrentUser().getUid(), email,
////                                            mpNumber.getText().toString().trim(), phoneNumber.getText().toString().trim());
////                                    uc.setUser(user);
//                                    sendVerificationEmail();
//                                }
//                            }
//                        });

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }

    private void sendVerificationEmail() {
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//
//        user.sendEmailVerification()
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        if (task.isSuccessful()) {
//                            // email sent
//                            Toast.makeText(SignUpActivity.this, "Email Verification Sent", Toast.LENGTH_SHORT).show();
//                            // after email is sent just logout the user and finish this activity
//                            FirebaseAuth.getInstance().signOut();
//                            startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
//                            SignUpActivity.this.finish();
//                        } else {
//                            // email not sent, so display message and restart the activity or do whatever you wish to do
//                            //restart this activity
//                            Toast.makeText(SignUpActivity.this, "Email Verification not Sent", Toast.LENGTH_SHORT).show();
//                            overridePendingTransition(0, 0);
//                            startActivity(getIntent());
//                            SignUpActivity.this.finish();
//                        }
//                    }
//                });
    }
}
