package com.example.rachanagajjar.lavishdecor;

/**
 * Created by rachanagajjar on 01-May-17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSettings_onClick(View view) {
        Intent intent =new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }
}

