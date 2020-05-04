package com.example.testserdar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView emailText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.login);
        emailText = (EditText) findViewById(R.id.log_user);
        passwordText = (EditText) findViewById(R.id.log_pass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username;
                String pass;

                username = emailText.getText().toString();
                pass = passwordText.getText().toString();

                if(username.equals("socrates@gmail.com") && pass.equals("hello")){

                    Intent intent = new Intent(v.getContext(), user.class);
                    startActivity(intent);
                }

                else if(username.equals("socrates@gmail.com") && pass!="hello"){

                    Toast.makeText(getApplicationContext(), "Password is incorrect!", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "Incorrect user details", Toast.LENGTH_SHORT).show();
                }

            }
        });






    }
}
