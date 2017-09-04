package com.example.rachanagajjar.lavishdecor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by rachanagajjar on 30-Apr-17.
 */

public class Table extends AppCompatActivity
{


    ListView list;
    String[] item = {"description: id = 05, name = simple  , price = 2000$ , color = white" };

    int [] image= {R.mipmap.sofa_snow};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.list_item);
        CustomAdapter adapter = new CustomAdapter(this, item, image);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(Table.this, "Item CLicked "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();

            }
        });
    }
}

