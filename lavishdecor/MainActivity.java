package com.example.rachanagajjar.lavishdecor;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login;
    private DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);

        db = new DBHelper(this);
    }

    public void login(View v){
        String uname = username.getText().toString().trim();
        String pword = password.getText().toString();
        db.saveData(uname ,pword);
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
        Toast.makeText(this, "Logged in Successfully", Toast.LENGTH_SHORT).show();

    }


    public void register(View v)
    {
        Intent i = new Intent(getApplicationContext(), MainRegister.class);
        startActivity(i);

    }

}

