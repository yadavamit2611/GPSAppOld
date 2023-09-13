package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    TextView welcome;

    //TextView tvLongitude,tvLatitude, tvAltitude,tvAccuracy,tvSpeed,tvAddress;

    TextView tvLongitudeVal,tvLatitudeVal, tvAltitudeVal,tvAccuracyVal,tvSpeedVal,tvAddressVal,tvUpdates,tvSensor;
    Switch swGps, swLocationUpdates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLongitudeVal = findViewById(R.id.tvLongitudeVal);
        tvLatitudeVal = findViewById(R.id.tvLatitudeVal);
        tvAltitudeVal = findViewById(R.id.tvAltitudeVal);
        tvAccuracyVal = findViewById(R.id.tvAccuracyVal);
        tvSpeedVal = findViewById(R.id.tvSpeedVal);
        tvAddressVal = findViewById(R.id.tvAddressVal);
        tvUpdates = findViewById(R.id.tvUpdates);
        tvSensor = findViewById(R.id.tvSensor);
        swGps = findViewById(R.id.sw_gps);
        swLocationUpdates = findViewById(R.id.sw_locationsupdates);


        auth = FirebaseAuth.getInstance();
        welcome = findViewById(R.id.welcome);
        if(auth.getCurrentUser() == null){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}