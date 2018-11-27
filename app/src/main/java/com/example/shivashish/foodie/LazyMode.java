package com.example.shivashish.foodie;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class LazyMode extends AppCompatActivity {

    ArrayList<String> input_arrray2 = new ArrayList<String>(1000);

    List<List<String>> table = new ArrayList<List<String>>();
    AutoCompleteTextView autoCompleteTextView;
    String[] a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lazy_mode);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.input_lazy);
        a2 = getResources().getStringArray(R.array.ing);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, a2);
        autoCompleteTextView.setAdapter(adapter);
        ListView myListView = (ListView) findViewById(R.id.myListView2);
        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                        AlertDialog.Builder a = new AlertDialog.Builder(LazyMode.this);
                        a.setMessage("Do you want to delete this ingredient ?").setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        delete(position);
                                    }
                                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog alert = a.create();
                        String str = String.valueOf(parent.getItemAtPosition(position));
                        alert.setTitle(str);
                        alert.show();
                    }
                }
        );

        //Adding items
        for (int i = 0; i < 10; i++)
            table.add(new ArrayList<String>());

        table.get(0).add("Ajwain");
        table.get(0).add("Butter");
        table.get(0).add("Chat Masala");
        table.get(0).add("Curd");
        table.get(0).add("Ginger Garlic Paste");
        table.get(0).add("Lemon");
        table.get(0).add("Mustard Oil");
        table.get(0).add("Onion");
        table.get(0).add("Paneer");
        table.get(0).add("Pepper");
        table.get(0).add("Red Chilli Powder");
        table.get(0).add("Salt");
        table.get(0).add("Turmeric Powder");

        table.get(1).add("Garam Masala");
        table.get(1).add("Jeera");
        table.get(1).add("Mustard Oil");
        table.get(1).add("Potato");
        table.get(1).add("Red Chilli Powder");
        table.get(1).add("Salt");
        table.get(1).add("Urad Dal");

        table.get(2).add("Black Pepper");
        table.get(2).add("Besan");
        table.get(2).add("Cardamom");
        table.get(2).add("Cinnamon");
        table.get(2).add("Cloves");
        table.get(2).add("Coriander");
        table.get(2).add("Coriander Leaves");
        table.get(2).add("Cumin Seeds");
        table.get(2).add("Garam Masala");
        table.get(2).add("Ghee");
        table.get(2).add("Ginger");
        table.get(2).add("Kasuri Methi");
        table.get(2).add("Oil");
        table.get(2).add("Onion");
        table.get(2).add("Paneer");
        table.get(2).add("Red Chilli Powder");
        table.get(2).add("Salt");
        table.get(2).add("Tomato");
        table.get(2).add("Turmeric Powder");

        table.get(3).add("Chicken");
        table.get(3).add("Curry Powder");
        table.get(3).add("Garlic Cloves");
        table.get(3).add("Ground Ginger");
        table.get(3).add("Onion");
        table.get(3).add("Pepper");
        table.get(3).add("Salt");
        table.get(3).add("Tomato");
        table.get(3).add("Vegetable Oil");

        table.get(4).add("Chana Dal");
        table.get(4).add("Chilli Powder");
        table.get(4).add("Coriander Powder");
        table.get(4).add("Cumin Powder");
        table.get(4).add("Green Chilli");
        table.get(4).add("Oil");
        table.get(4).add("Red Chilli");
        table.get(4).add("Rice");
        table.get(4).add("Tamarind juice");
        table.get(4).add("Turmeric");

        table.get(5).add("Bay Leaf");
        table.get(5).add("Butter");
        table.get(5).add("Cardamom");
        table.get(5).add("Cashewnuts");
        table.get(5).add("Coriander Leaves");
        table.get(5).add("Corn Flour");
        table.get(5).add("Garam Masala");
        table.get(5).add("Ghee");
        table.get(5).add("Ginger Garlic Paste");
        table.get(5).add("Green Chili");
        table.get(5).add("Kasuri Methi");
        table.get(5).add("Milk");
        table.get(5).add("Paneer");
        table.get(5).add("Red Chilli Powder");
        table.get(5).add("Salt");
        table.get(5).add("Tomato");

        table.get(6).add("Amchoor");
        table.get(6).add("Beans");
        table.get(6).add("Breadcrumbs");
        table.get(6).add("Carrot");
        table.get(6).add("Coriander leaves");
        table.get(6).add("Coriander powder");
        table.get(6).add("Garam Masala");
        table.get(6).add("Ginger");
        table.get(6).add("Green chilli");
        table.get(6).add("Maida");
        table.get(6).add("Maida paste");
        table.get(6).add("Oil");
        table.get(6).add("Onion");
        table.get(6).add("Potato");
        table.get(6).add("Red Chilli Powder");
        table.get(6).add("Salt");

        table.get(7).add("Amchoor Powder");
        table.get(7).add("Bay Leaf");
        table.get(7).add("Beans");
        table.get(7).add("Black Pepper");
        table.get(7).add("Capsicum");
        table.get(7).add("Carrot");
        table.get(7).add("Cauliflower");
        table.get(7).add("Chana Dal");
        table.get(7).add("Coconut");
        table.get(7).add("Coconut Milk");
        table.get(7).add("Coriander");
        table.get(7).add("Corn Flour");
        table.get(7).add("Cumin Seeds");
        table.get(7).add("Curry Leaves");
        table.get(7).add("Dry Red Chilli");
        table.get(7).add("Garam Masala");
        table.get(7).add("Ginger Garlic Paste");
        table.get(7).add("Green Chilli");
        table.get(7).add("Mustard Seeds");
        table.get(7).add("Oil");
        table.get(7).add("Onion");
        table.get(7).add("Paneer");
        table.get(7).add("Potato");
        table.get(7).add("Red Chilli Powder");
        table.get(7).add("Salt");
        table.get(7).add("Sambhar Masala");
        table.get(7).add("Sugar");
        table.get(7).add("Tomato");
        table.get(7).add("Urad Dal");

        table.get(8).add("Butter");
        table.get(8).add("Cashewnuts");
        table.get(8).add("Chicken");
        table.get(8).add("Cream");
        table.get(8).add("Garam Masala");
        table.get(8).add("Garlic Paste");
        table.get(8).add("Ginger garlic paste");
        table.get(8).add("Kasuri Methi");
        table.get(8).add("Oil");
        table.get(8).add("Onion");
        table.get(8).add("Red chilli powder");
        table.get(8).add("Salt");
        table.get(8).add("Sugar");
        table.get(8).add("Tomatoes");
        table.get(8).add("Vinegar");

        table.get(9).add("Chat Masala");
        table.get(9).add("Coriander Leaves");
        table.get(9).add("Garam Masala");
        table.get(9).add("Garlic");
        table.get(9).add("Ginger");
        table.get(9).add("Green Chilli");
        table.get(9).add("Lemon Juice");
        table.get(9).add("Onion");
        table.get(9).add("Soya");
        table.get(9).add("Tomato");

    }

    public void delete(int pos) {
        input_arrray2.remove(pos);
        ListAdapter myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, input_arrray2);
        ListView myListView = (ListView) findViewById(R.id.myListView2);
        myListView.setAdapter(myadapter);
    }

    public void adding2(View view) {
        String v = autoCompleteTextView.getText().toString();
        input_arrray2.add(v);
        ListAdapter myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, input_arrray2);
        ListView myListView = (ListView) findViewById(R.id.myListView2);
        myListView.setAdapter(myadapter);
        autoCompleteTextView.setText("");
    }

    public void search2(View view) {
        int size1 = input_arrray2.size();
        for (int i = 0; i < 10; i++) {
            int size2 = table.get(i).size();
            int gl = 0;
            for (int j = 0; j < size2; j++) {
                int fl = 0;
                for (int k = 0; k < size1; k++) {
                    int x = table.get(i).get(j).compareToIgnoreCase(input_arrray2.get(k));
                    if (x == 0) {
                        fl = 1;
                        break;
                    }
                }
                if (fl == 0) {
                    gl = 1;
                    break;
                }
            }
            if (gl == 0)
                Option.index.add(i);
        }
        Intent i_lazy = new Intent(this, Result.class);
        startActivity(i_lazy);
    }
}
