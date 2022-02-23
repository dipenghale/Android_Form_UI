package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GoToRegisterForm(View view) {
        TextView textView = (TextView) findViewById(R.id.register_now);
        String regtxt;
        regtxt =textView.getText().toString();
        if(regtxt.equals("Not yet a User? Register Now"))
        {
            Intent gotonextact = new Intent(this,RegisterForm.class);
            //gotonextact.putExtra("msg","Message from Main Activity");
            startActivity(gotonextact);
        }

    }
}