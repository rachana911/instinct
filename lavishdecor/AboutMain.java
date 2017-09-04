package com.example.rachanagajjar.lavishdecor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutMain extends AppCompatActivity {
    TextView about,Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_main);

        about = (TextView) findViewById(R.id.textView);
        Description = (TextView) findViewById(R.id.textView2);
    }
}
