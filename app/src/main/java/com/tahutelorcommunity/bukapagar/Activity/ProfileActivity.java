package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

public class ProfileActivity extends AppCompatActivity {

    Toolbar toolbar;
    private final String TAG = "ProfilAktivity";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Profil");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        Button btnEdit = (Button) findViewById(R.id.btn_edit);
        TextView edtNama = (TextView) findViewById(R.id.txt_nama);
        TextView edtAlamat = (TextView) findViewById(R.id.txt_alamat);
        TextView edtEmail = (TextView) findViewById(R.id.txt_email);
        TextView edtNoHp = (TextView) findViewById(R.id.txt_no_hp);

        edtNama.setText(userLogin.getUserName());
        edtEmail.setText(userLogin.getEmail());
        edtNoHp.setText("Not Registered");
        edtAlamat.setText(userLogin.getConfirmed().equalsIgnoreCase("1")?"iya":"tidak");
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Segera Tersedia", Toast.LENGTH_SHORT).show();
            }
        });
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
