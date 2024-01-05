package com.example.ibcool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView paymentImageView = findViewById(R.id.payment);

        paymentImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event, for example, start the Wallet activity
                Intent intent = new Intent(MainActivity.this, Statement.class);
                startActivity(intent);
            }
        });
    }
}