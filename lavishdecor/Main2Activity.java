package com.example.rachanagajjar.lavishdecor;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.*;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.Locale;

public class Main2Activity extends AppCompatActivity
{

    private DrawerLayout mdl;
    private ActionBarDrawerToggle mtoggle;

    private Toolbar ntoolbar;


    NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ntoolbar=(Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(ntoolbar);

        mdl = (DrawerLayout) findViewById(R.id.drawer_layout);
        mtoggle=new ActionBarDrawerToggle(this,mdl,R.string.open,R.string.close);

        mdl.addDrawerListener(mtoggle);
        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("Category");

        nv =(NavigationView) findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {

            @Override
            public boolean onNavigationItemSelected(MenuItem item)
            {
                Intent i=null;
                switch (item.getItemId())
                {
                    case R.id.nav_category:

                     i = new Intent(getApplicationContext(), Category.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Category");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                    case R.id.nav_profile:
                        i = new Intent(getApplicationContext(), Category.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Profile");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                    case R.id.nav_feedback:
                         i = new Intent(getApplicationContext(), FeedbackMain.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Category");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                    case R.id.nav_cart:
                        i = new Intent(getApplicationContext(), Category.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Category");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                    case R.id.nav_setting:
                        i = new Intent(getApplicationContext(), SettingsActivity.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Category");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                    case R.id.nav_About:
                        i = new Intent(getApplicationContext(), AboutMain.class);
                        startActivity(i);
                        getSupportActionBar().setTitle("Category");
                        item.setChecked(true);
                        mdl.closeDrawers();
                        break;
                }

                return true;
            }
         });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (mtoggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
