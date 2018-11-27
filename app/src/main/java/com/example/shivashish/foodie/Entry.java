package com.example.shivashish.foodie;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.content.Intent;

public class Entry extends AppCompatActivity {

    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent i=new Intent(getApplicationContext() , Option.class);
            startActivity(i);
        }
    };
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
        System.exit(0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        Runnable r=new Runnable() {
            @Override
            public void run() {
                long future=System.currentTimeMillis()+2000;
                while(System.currentTimeMillis()<future)
                {
                    synchronized (this){
                        try{
                            wait(future-System.currentTimeMillis());
                        }catch(Exception e){}
                        }
                }
                handler.sendEmptyMessage(0);
            }
        };
        Thread t=new Thread(r);
        t.start();

    }
}
