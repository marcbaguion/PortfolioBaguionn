package com.example.portfoliobaguion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContactListenerMethod();
        btnOnlineListenerMethod();
        btnPlacesListenerMethod();
    }

    private void btnContactListenerMethod() {
        Intent intent = new Intent(this, ContactActivity.class);
        Button button = findViewById(R.id.btnContact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    private void btnOnlineListenerMethod() {
        Intent intent = new Intent(this, OnlinePresenceActivity.class);
        Button button = findViewById(R.id.btnOnline);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    private void btnPlacesListenerMethod() {
        Intent intent = new Intent(this, PlacesActivity.class);
        Button button = findViewById(R.id.btnPlaces);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}