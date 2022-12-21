package com.ricardo_rivera_beltran.sprintuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    //Método para botón Anterior
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}