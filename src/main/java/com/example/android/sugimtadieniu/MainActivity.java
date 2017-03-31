package com.example.android.sugimtadieniu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageView
        ImageView flower = (ImageView) findViewById(R.id.flower);

        // Set a click listener on that View
        flower.setOnClickListener(new View.OnClickListener() {
            // The fire place activity will be opened when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent fireIntent = new Intent(MainActivity.this, FirePlace.class);
                startActivity(fireIntent);
            }
        });
    }
}
