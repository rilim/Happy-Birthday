package com.example.android.sugimtadieniu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BookPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);

        // Find the ImageView
        ImageView book = (ImageView) findViewById(R.id.book);

        // Set a click listener on that View
        book.setOnClickListener(new View.OnClickListener() {
            // The spring activity will be opened when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent springIntent = new Intent(BookPage.this, Spring.class);
                startActivity(springIntent);
            }
        });
    }
}
