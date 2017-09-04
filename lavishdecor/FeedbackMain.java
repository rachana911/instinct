package com.example.rachanagajjar.lavishdecor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class FeedbackMain extends AppCompatActivity {
    EditText comment;
    RatingBar rate = null;
    Button submit;
    DBFeedback db;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback__main);

        db  = new DBFeedback(getApplicationContext());


        comment = (EditText)findViewById(R.id.multitxt);
        rate = (RatingBar)findViewById(R.id.ratingBar);
        rate.setNumStars(5);
        submit = (Button)findViewById(R.id.btnsub);

        // db = new DBFeedback(this);
    }
    public void setSubmit(View v){
        String feedback = comment.getText().toString();
        float Rate= rate.getRating();
        boolean saveState =  db.saveData(feedback ,Rate);
        if(saveState)
            Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "NOT Submitted Successfully", Toast.LENGTH_SHORT).show();
    }
}
