package com.example.rachanagajjar.lavishdecor;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Category extends AppCompatActivity
{

    ListView list;
    String[] item = {"chair", "table","bed", "TV Unit", "sofa", "dining"};
    int [] image= {R.mipmap.chair, R.mipmap.table,R.mipmap.bed,
            R.mipmap.tvunit,R.mipmap.sofa,R.mipmap.dining};
    DrawerLayout mdl;
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
                Intent j=null;
                int viewId=view.getId();

                switch (i)
                {
                    case 0:
                     j  = new Intent(getApplicationContext(), Chair.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Chair");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 1:
                        j = new Intent(getApplicationContext(), Table.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Table");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 2:
                        j = new Intent(getApplicationContext(), Bed.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Bed");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 3:
                        j = new Intent(getApplicationContext(), TV_Unit.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("TV Unit");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 4:
                        j = new Intent(getApplicationContext(), Sofa.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Sofa");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 5:
                        j = new Intent(getApplicationContext(), Dining.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Dining");
                        Toast.makeText(Category.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;

                }

            }
        });
    }

    }
