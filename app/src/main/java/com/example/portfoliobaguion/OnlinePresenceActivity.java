package com.example.portfoliobaguion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OnlinePresenceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        btnGithubListenerMethod();
        btnFBListenerMethod();
    }
    private void btnGithubListenerMethod() {
        Button btnCall = findViewById(R.id.btnGit);
        Uri web = Uri.parse("https://github.com/marcbaguion");
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    private void btnFBListenerMethod() {
        Button btnCall = findViewById(R.id.btnFb);
        Uri web = Uri.parse("https://www.facebook.com/marcbaguion18");
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}

