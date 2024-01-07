package com.example.ibcool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ibcool.Adapter.adt_rv_cardview;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Statement extends AppCompatActivity {
    private boolean isHidden = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);

        TextView textView = findViewById(R.id.text_view_codenuumber2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.show, 0);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle between two text values
                if (isHidden) {
                    textView.setText("1,000,000 USD");
                } else {
                    textView.setText("********");
                }

                // Toggle the state for the next click
                isHidden = !isHidden;
            }
        });



        RecyclerView rv=(RecyclerView) findViewById(R.id.rcv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        RecyclerView.Adapter adt= new adt_rv_cardview();
        rv.setAdapter(adt);
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Drawable right clicked!");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when OK button is clicked
            }
        });
        builder.show();
    }
}