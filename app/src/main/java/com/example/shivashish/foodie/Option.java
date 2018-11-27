package com.example.shivashish.foodie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import java.util.ArrayList;

public class Option extends AppCompatActivity {
    public Option() {
    }
    public static ArrayList<Integer> index = new ArrayList<Integer>(1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    public void active(View view){
        Intent i1=new Intent(getApplicationContext() , ActiveMode.class);
        startActivity(i1);
    }
    public void lazy(View view)
    {
        Intent i2=new Intent(getApplicationContext() , LazyMode.class);
        startActivity(i2);
    }
}
