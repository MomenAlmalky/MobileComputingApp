package com.example.almal.mobilecomputing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }

    public void signIn(View view) {
        Toast.makeText(getApplicationContext(),"you are signed in",Toast.LENGTH_LONG).show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.LogoutMenu:
                Intent logout = new Intent(this,SignUP.class);
                startActivity(logout);
                return true;
            case R.id.MyProfileMenu:
                Intent MyProfile = new Intent(this,MyProfile.class);
                startActivity(MyProfile);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
