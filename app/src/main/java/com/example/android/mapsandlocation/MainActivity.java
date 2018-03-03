package com.example.android.mapsandlocation;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mapButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapButton = (Button) findViewById(R.id.map_button);

    }

    public void mapClick(View view){
        Intent map = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(map);
    }

}
