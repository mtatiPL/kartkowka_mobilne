package com.example.kartkowka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int licznik=0;
TextView losowanie;
Button zwieksz;
Button minus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        losowanie=findViewById(R.id.losowanie);
        zwieksz=findViewById(R.id.zwieksz);
        minus=findViewById(R.id.minus);


    }
    public  void losuj(View view){
        licznik=(int)(Math.random()*5+1) ;
        losowanie.setText(String.valueOf(licznik));
        zwieksz.setVisibility(View.VISIBLE);
        minus.setVisibility(View.VISIBLE);
    }
    public void dodaj(View view){
licznik++;
        losowanie.setText(String.valueOf(licznik));
        zwieksz.setVisibility(View.INVISIBLE);
        minus.setVisibility(View.INVISIBLE);

    }
    public void minus(View view){
        licznik--;
        losowanie.setText(String.valueOf(licznik));
        zwieksz.setVisibility(View.INVISIBLE);
        minus.setVisibility(View.INVISIBLE);

    }
}