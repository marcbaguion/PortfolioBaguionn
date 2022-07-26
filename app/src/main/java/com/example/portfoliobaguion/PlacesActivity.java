package com.example.portfoliobaguion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        btnPastListenerMethod();
        btnPresentListenerMethod();
    }
    private void btnPastListenerMethod() {
        Button btnCall = findViewById(R.id.btnMall);
        Uri map = Uri.parse("geo:0.0?q=Robinsons+Place+Ormoc+City");
        Intent intent = new Intent(Intent.ACTION_VIEW, map);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    private void btnPresentListenerMethod() {
        Button btnCall = findViewById(R.id.btnCani);
        Uri map = Uri.parse("geo:0.0?q=Canigao+Island+Matalom");
        Intent intent = new Intent(Intent.ACTION_VIEW, map);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}