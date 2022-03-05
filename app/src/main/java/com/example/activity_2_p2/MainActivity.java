package com.example.activity_2_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi Variabel untuk EditText
    EditText edEmail, edPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = "alfin";
        String password = "123";

        //Mehubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSigin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edEmail = findViewById(R.id.edEmail);

        //menghubungkan variabel edPassword dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((edEmail.getText().toString().trim().equals(username)) && (edPassword.getText().toString().trim().equals(password))) {
                    Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_LONG).show();
                } else if ((edEmail.getText().toString().trim().equals(username))) {
                    Toast.makeText(getApplicationContext(), "Password Salah!", Toast.LENGTH_LONG).show();
                } else if ((edPassword.getText().toString().trim().equals(password))) {
                    Toast.makeText(getApplicationContext(), "Email Salah!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Email Atau Password Salah!", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}












