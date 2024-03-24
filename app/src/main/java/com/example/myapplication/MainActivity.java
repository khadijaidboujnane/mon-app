package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();


    }
    public void buClick(View view)
    {
        EditText txtEmail=(EditText)findViewById(R.id.editTextEmail);
        EditText txtpassword=(EditText)findViewById(R.id.editTextPassword);
        TextView tvusername=(TextView) findViewById(R.id.tvName);
        TextView textViewForgotPassword=(TextView) findViewById(R.id.textViewForgotPassword);
        Intent myintent=new Intent(this, Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("Email",txtEmail.getText().toString());
        b.putString("password",txtpassword.getText().toString());
        b.putString("tvusername",tvusername.getText().toString());
        b.putString("textViewForgotPassword",textViewForgotPassword.getText().toString());
        myintent.putExtras(b);
        startActivity(myintent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
    }



}