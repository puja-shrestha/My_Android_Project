package com.example.mypc.my_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText fullname,username,email,contactno,password,confirmpassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname = (EditText)findViewById(R.id.fullName);
        username = (EditText)findViewById(R.id.userName);
        email = (EditText)findViewById(R.id.email);
        contactno = (EditText)findViewById(R.id.contactNo);
        password = (EditText)findViewById(R.id.password);
        confirmpassword = (EditText)findViewById(R.id.confirmPassword);
        button = (Button)findViewById(R.id.regiter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(RegisterActivity.this,MainActivity.class);
                Toast.makeText(RegisterActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
    }

}
