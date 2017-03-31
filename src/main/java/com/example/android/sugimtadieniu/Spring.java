package com.example.android.sugimtadieniu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Spring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring);


        // Find the ImageView
        ImageView spring = (ImageView) findViewById(R.id.spring);

        // Set a click listener on that View
        spring.setOnClickListener(new View.OnClickListener() {
            // Show toast message when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(Spring.this, getString(R.string.toast_message), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
