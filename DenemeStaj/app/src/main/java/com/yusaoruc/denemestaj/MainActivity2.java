package com.yusaoruc.denemestaj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
   public ArrayList<Kullanici> arrayList=new ArrayList<Kullanici>();
    EditText userName;
    EditText userEmail;
    EditText userPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        userName=(EditText)findViewById(R.id.RegisterUserName);
        userEmail=(EditText)findViewById(R.id.RegisterEmail);
        userPass=(EditText)findViewById(R.id.RegisterPassword);


    }
    public void save(View view){
        startActivity(new Intent(MainActivity2.this,MainActivity.class));
        String nameUser = userName.getText().toString();
        String email = userEmail.getText().toString();
        String password= userPass.getText().toString();

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
            Toast.makeText(this,"Email is Empyt ! ", Toast.LENGTH_LONG).show();
        }
        else{
            Kullanici kullanici= new Kullanici(nameUser,email,password);
            arrayList.add(kullanici);
            Toast.makeText(this,"Kayit Basarili! ",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity2.this,MainActivity.class);
            intent.putExtra("kullanici",arrayList);
            startActivity(intent);
        }

    }
}