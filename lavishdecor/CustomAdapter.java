package com.example.rachanagajjar.lavishdecor;

/**
 * Created by rachanagajjar on 30-Apr-17.
 */
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter
{
    Context context;
    String [] item = null;
    int [] images= null;
    DrawerLayout mdl;
    public CustomAdapter(Context context, String[] item, int [] images ) {
       // super(context,);

      // super(context, R.layout.activity_category );
        this.context = context;
        this.item = item;
        this.images = images;

    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater onlineInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = onlineInflater.inflate(R.layout.activity_category,null);
        TextView textView = (TextView) customView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) customView.findViewById(R.id.imageView);

        textView.setText(item[position]);
        imageView.setImageResource(images[position]);

     /*   customView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=null;
                switch(view.getId()){
                    case 0:
                        j  = new Intent(context, Chair.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Chair");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 1:
                        j = new Intent(getApplicationContext(), Table.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Table");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 2:
                        j = new Intent(getApplicationContext(), Bed.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Bed");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 3:
                        j = new Intent(getApplicationContext(), TV_Unit.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("TV Unit");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 4:
                        j = new Intent(getApplicationContext(), Sofa.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Sofa");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;
                    case 5:
                        j = new Intent(getApplicationContext(), Dining.class);
                        startActivity(j);
                        getSupportActionBar().setTitle("Dining");
                        Toast.makeText(CustomAdapter.this, "Item Selected "+adapterView.getItemAtPosition(i), Toast.LENGTH_LONG).show();
                        mdl.closeDrawers();
                        break;


                }
            }
        }  );*/
        return customView;

    }

}

