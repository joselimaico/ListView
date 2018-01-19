package com.example.root.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lstView;
    private ArrayList<String> listViewItems = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView = (ListView)findViewById(R.id.mainListView);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,listViewItems);
        lstView.setAdapter(adapter);
        adapter.add("thing1");
        adapter.add("thing2");
        adapter.add("thing3");
        adapter.notifyDataSetChanged();
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),"Clic en el item numero " +
                        position, Toast.LENGTH_LONG).show();
                String pos = listViewItems.get(position);
                Toast.makeText(getApplicationContext(),pos, Toast.LENGTH_LONG).show();

            }
        });


    }
}
