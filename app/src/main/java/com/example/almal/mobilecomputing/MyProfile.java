package com.example.almal.mobilecomputing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        TextView textView = (TextView) findViewById(R.id.MyProfileText);
        textView.setText("Welcome Back To your Profile :)");
    }

}
