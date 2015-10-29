package com.example.nicol.calc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivityConvertisseur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_convertisseur);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void versCalculatrice(View v){
        Intent intent = new Intent(this,MainActivityCalc.class);
        startActivity(intent);
    }

    public void versTaxes(View v){
        Intent intent = new Intent(this,MainActivityTaxes.class);
        startActivity(intent);
    }
    }



