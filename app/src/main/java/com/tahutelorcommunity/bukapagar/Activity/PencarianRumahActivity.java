package com.tahutelorcommunity.bukapagar.Activity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tahutelorcommunity.bukapagar.Adapter.AdapterSwipeUp;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Model.Penginapan.Penginapan;
import com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product_;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.LocationTrackingManager;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;
import com.tahutelorcommunity.bukapagar.Utils.DbManager;

import java.util.ArrayList;
import java.util.List;

import co.mobiwise.materialintro.shape.Focus;
import co.mobiwise.materialintro.shape.FocusGravity;
import co.mobiwise.materialintro.shape.ShapeType;
import co.mobiwise.materialintro.view.MaterialIntroView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PencarianRumahActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback {

    DatabaseReference dbref = FirebaseDatabase.getInstance().getReference();
    BottomSheetBehavior mBottomSheetBehavior;
    FloatingSearchView mSearchView;
    DrawerLayout drawer;
    SupportMapFragment mapFragment;
    Location myLocation;
    GoogleMap map;
    RecyclerView recyclerSwipeUp;
    private LinearLayoutManager lLayout;
    List<Product_> productSearced;
    LatLng latLngsaya;
    AdapterSwipeUp abr;
    private final String TAG = "PencarianRumah";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_pencarian_rumah); //error inflate
        } catch (Exception e) {
            try {
                setContentView(R.layout.activity_pencarian_rumah); //error inflate maps
            } catch (Exception en) {
                setContentView(R.layout.activity_pencarian_rumah); //can do inflate
            }
        }

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        productSearced = new ArrayList<>();

        recyclerSwipeUp = (RecyclerView) findViewById(R.id.recycler_view_swipe_up);

        LocationTrackingManager ltm = new LocationTrackingManager(getApplicationContext());
        myLocation = ltm.getLastLocationSaved();

        if (null == myLocation) {
            ltm.getLastLocation();
            myLocation = ltm.getLastLocationSaved();
            if (null == myLocation) {
                myLocation = new Location("");
                User user = DbManager.getOneUser(getApplicationContext());
                try {
                    String lat = user.getLatitude();
                    String lng = user.getLongitude();
                    myLocation.setLatitude(Double.parseDouble(lat));
                    myLocation.setLongitude(Double.parseDouble(lng));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        View bottomSheet = findViewById(R.id.bottom_sheet);
        mSearchView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        new MaterialIntroView.Builder(this)
                .enableDotAnimation(true)
                .enableIcon(false)
                .setFocusGravity(FocusGravity.CENTER)
                .setFocusType(Focus.NORMAL)
                .setDelayMillis(500)
                .setTargetPadding(500)
                .enableFadeAnimation(true)
                .performClick(true)
                .setInfoText("Hi coba klik / tap lalu lihat apa yang terjadi.")
                .setShape(ShapeType.CIRCLE)
                .setTarget(bottomSheet)
                .setUsageId("intro_ca") //THIS SHOULD BE UNIQUE ID
                .show();

        new MaterialIntroView.Builder(this)
                .enableDotAnimation(true)
                .enableIcon(false)
                .setFocusGravity(FocusGravity.CENTER)
                .setFocusType(Focus.NORMAL)
                .setDelayMillis(500)
                .setTargetPadding(500)
                .enableFadeAnimation(true)
                .performClick(true)
                .setInfoText("Hi coba klik / tap dan ketikkan sesuatu lalu lihat apa yang terjadi.")
                .setShape(ShapeType.CIRCLE)
                .setTarget(mSearchView)
                .setUsageId("intro_ci") //THIS SHOULD BE UNIQUE ID
                .show();

        mSearchView.setOnQueryChangeListener(new FloatingSearchView.OnQueryChangeListener() {
            @Override
            public void onSearchTextChanged(String oldQuery, final String newQuery) {
                try {
                    testAPIgetLapak("bkpgfikgntg " +newQuery);
                    mBottomSheetBehavior.setPeekHeight(1500);
                } catch (Exception e) {
                }
            }
        });

        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        mBottomSheetBehavior.setPeekHeight(144);
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        mBottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                    mBottomSheetBehavior.setPeekHeight(144);
                }
            }

            @Override
            public void onSlide(View bottomSheet, float slideOffset) {
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, null, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mSearchView.setOnLeftMenuClickListener(new FloatingSearchView.OnLeftMenuClickListener() {
            @Override
            public void onMenuOpened() {
                drawer.openDrawer(GravityCompat.START);
            }

            @Override
            public void onMenuClosed() {
                drawer.closeDrawer(GravityCompat.START);
            }
        });
    }

    public void testAPIgetLapak(String search) {
        Request loginService =
                ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> call = loginService.getSearchProducts("products.json?keywords=" + search + "&page=1&per_page=10");
        call.enqueue(new Callback<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product>() {
            @Override
            public void onResponse(Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> call,
                                   Response<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> response) {
                if (response.isSuccessful()) { // seller sebagai UUID Login
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Toast.makeText(PencarianRumahActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        lLayout = new LinearLayoutManager(PencarianRumahActivity.this);
                        recyclerSwipeUp.setLayoutManager(lLayout);
                        productSearced = response.body().getProducts();

                        abr = new AdapterSwipeUp(PencarianRumahActivity.this, productSearced);
                        recyclerSwipeUp.setAdapter(abr);
                    }
                } else {
                    Log.d(TAG, "" + response.toString());
                    Toast.makeText(PencarianRumahActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<com.tahutelorcommunity.bukapagar.Model.Products.ProductList.Product> call, Throwable t) {
                // something went completely south (like no internet connection)
                Log.d(TAG, t.getMessage());
            }
        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pencarian_rumah, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cari_pagar) {
        } else if (id == R.id.nav_buka_pagar) {
            startActivity(new Intent(PencarianRumahActivity.this, BukaRumahActivity.class));
        } else if (id == R.id.nav_transaksi_tuan_rumah) {
            startActivity(new Intent(PencarianRumahActivity.this, TransaksiTuanRumahActivity.class));
        } else if (id == R.id.nav_transaksi_penyewa) {
            startActivity(new Intent(PencarianRumahActivity.this, TransaksiPenyewaActivity.class));
        } else if (id == R.id.nav_setting) {
            startActivity(new Intent(PencarianRumahActivity.this, SettingActivity.class));
        } else if (id == R.id.nav_cart) {
            startActivity(new Intent(PencarianRumahActivity.this, CartActivity.class));
        } else {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.clear();
        map.getUiSettings().setZoomControlsEnabled(true);
        try {
            dbref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    Penginapan penginapan = dataSnapshot.getValue(Penginapan.class);
                    LatLng myLatLng = new LatLng(penginapan.getLat(), penginapan.getLng());
                    latLngsaya = myLatLng;
                    map.addMarker(new MarkerOptions().position(myLatLng).icon(BitmapDescriptorFactory.fromResource(R.drawable.bpicon))).setTitle(penginapan.getId());

                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

            if (myLocation.getLatitude() == 0) {
                if (latLngsaya != null) {
                    map.animateCamera(CameraUpdateFactory.
                            newLatLngZoom(latLngsaya, 10));
                } else {
                    map.animateCamera(CameraUpdateFactory.
                            newLatLngZoom(new LatLng(-7.9280449,112.6536193), 10));
                }
            } else {
                map.animateCamera(CameraUpdateFactory.
                        newLatLngZoom(new LatLng(myLocation.getLatitude(), myLocation.getLongitude()), 10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                Intent intent = new Intent(PencarianRumahActivity.this, DetailPenginapanAddToCart.class);
                intent.putExtra("productId", marker.getTitle());
                startActivity(intent);
                return true;
            }
        });
    }
}
