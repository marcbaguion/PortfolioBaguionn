package com.example.portfoliobaguion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        btnCallListenerMethod();
    }

    private void btnCallListenerMethod() {
        ImageButton btnCall = findViewById(R.id.btnCall);
        Uri number = Uri.parse("tel: 09555100210");
        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
