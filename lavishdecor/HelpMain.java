package com.example.rachanagajjar.lavishdecor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpMain extends AppCompatActivity {
    TextView contact, Description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main);

        contact = (TextView) findViewById(R.id.textView);
        Description = (TextView) findViewById(R.id.textView2);
    }
}
