package com.example.ibcool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ibcool.Adapter.adt_rv_cardview;

import android.os.Bundle;

public class Statement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);
        RecyclerView rv=(RecyclerView) findViewById(R.id.rcv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        RecyclerView.Adapter adt= new adt_rv_cardview();
        rv.setAdapter(adt);
    }
}