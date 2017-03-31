package com.example.android.sugimtadieniu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirePlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_place);

        // Find the ImageView
        ImageView fire = (ImageView) findViewById(R.id.firePlace);

        // Set a click listener on that View
        fire.setOnClickListener(new View.OnClickListener() {
            // The book page activity will be opened when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent bookIntent = new Intent(FirePlace.this, BookPage.class);
                startActivity(bookIntent);
            }
        });
    }
}
