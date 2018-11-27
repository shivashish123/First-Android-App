package com.example.shivashish.foodie;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.lang.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    ArrayList<String> dish=new ArrayList<String>(1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textView=(TextView)findViewById(R.id.textResult);
        dish.add("Paneer Tikka");dish.add("Aloo Fry");dish.add("Paneer Masala");dish.add("Chicken Curry");dish.add("Tamarind Rice");
        dish.add("Butter Paneer Masala");dish.add("Vegetable Cutlet");dish.add("Mix Veg");dish.add("Butter Chicken Masala");dish.add("Soya Chunks Fry");
        int y=Option.index.size();
        if(y==0)
        {
            textView.setText("No Result Found");
        }
        else
        {
            textView.setText("Following Results Found \nClick to get description of dish.");
            ArrayList<String> b=new ArrayList<String>(20);
            final ArrayList<Integer> c=new ArrayList<Integer>(20);
            for(int i=0;i<y;i++) {
                b.add(dish.get(Option.index.get(i)));
                c.add(Option.index.get(i));
            }
            Option.index.clear();
            ListAdapter myadapter3=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,b);
            ListView myListView3=(ListView)findViewById(R.id.resultListView);
            myListView3.setAdapter(myadapter3);
            myListView3.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            callswitch(c.get(position));
                        }
                    }
            );
        }
    }
    public void BackButton(View view)
    {
        Intent i4=new Intent(this, Option.class);
        startActivity(i4);
    }
    public void callswitch(int pos) {
        try{
        Class<?> theClass = Class.forName("com.example.shivashish.foodie.dish" + Integer.toString(pos+1));
        startActivity(new Intent(this, theClass));}catch (ClassNotFoundException e){}
    }
}
