package com.yusaoruc.denemestaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String user;
    String userPassword;
    ArrayList<Kullanici> kullanicilar = new ArrayList<Kullanici>();

    EditText userName;
    EditText password;
    Kullanici k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.LoginUserName);
        password=findViewById(R.id.LoginPassword);


    }
    public void login(View view){
        String name = userName.getText().toString();
        String passwr= password.getText().toString();
        for(int i=0; i<10; i++){
            if(kullanicilar.get(i).name.contentEquals(name.toString()) || kullanicilar.get(i).password.contentEquals(passwr.toString())){
                Toast.makeText(this,"oldu aga",Toast.LENGTH_LONG);
            }
        }

    }
    public void register(View view){
        startActivity(new Intent(MainActivity.this,MainActivity2.class));
    }
}