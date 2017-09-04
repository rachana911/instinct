package com.example.rachanagajjar.lavishdecor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainRegister extends AppCompatActivity {
    private EditText et_name, et_email, et_phone, et_password, et_cpassword;
    private String name, email, phone, password, cpassword;
    Button regbtn;
    private DBRegister db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        et_name =(EditText) findViewById(R.id.name);
        et_email =(EditText) findViewById(R.id.email);
        et_phone =(EditText) findViewById(R.id.Phone);
        et_password =(EditText) findViewById(R.id.Password);
        et_cpassword =(EditText) findViewById(R.id.Confirm_Password);
        regbtn =(Button) findViewById(R.id.regbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                register();
            }
        });
        db = new DBRegister(this);
    }
    public void register(){
        db.saveData(name,email,phone,password,cpassword);
        intialize();
        if (!validate()) {
            Toast.makeText(this,"Signup has Failed",Toast.LENGTH_SHORT).show();
        }
        else {
            onSignupSuccess();
            Toast.makeText(this, "You Registered Successfully", Toast.LENGTH_SHORT).show();
        }
    }
    public void  onSignupSuccess(){

    }
    public  boolean validate(){
        boolean valid= true;
        if(name.isEmpty()||name.length()>32){
            et_name.setError("Please Enter valid name");
            valid = false;
        }
        if (email.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            et_email.setError("Please Enter valid Email Address");
            valid = false;
        }
        if(password.isEmpty()) {
            et_password.setError("Please Enter Password");
            valid = false;
        }
        if(cpassword.isEmpty()) {
            et_cpassword.setError("Please Enter Password");
            valid = false;
        }
        if(phone.isEmpty()) {
            et_phone.setError("Please Enter Phone number");
            valid = false;
        }
        return valid;
    }
    public void intialize(){
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        phone = et_phone.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();

    }
}



