package fikri6998.fikrialfitrarahadi_1202150086_modul3;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.content.Intent;



public class LoginActivity extends AppCompatActivity {

    private Button mLogIn;
    private TextInputLayout mUsername, mPassword;
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = (TextInputLayout) findViewById(R.id.username);
        mPassword = (TextInputLayout) findViewById(R.id.password);
        mLogIn = (Button) findViewById(R.id.login);


    }

    public void LogIn(View view) {

        String user = mUsername.getEditText().getText().toString();
        String pass = mPassword.getEditText().getText().toString();

        if ((user.equals("EAD") && pass.equals("MOBILE"))){
            Toast.makeText(LoginActivity.this, "Berhasil Login",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent (LoginActivity.this, MainActivity.class);
            startActivity(intent);

        }  else if ((user.equals("")||pass.equals("")))
        //Atau jika input text 1 dan text 2 kosong maka tampilkan toast
        {
            Toast.makeText(this, "Isi Username dan Password", Toast.LENGTH_SHORT).show(); //menampilkan toast

        }

        else
        //jika kedua kondisi diatas tidak memenuhi maka tampilkan toast
        {
            Toast.makeText(this, "Maaf Username/Password Salah", Toast.LENGTH_SHORT).show(); //menampilkan toast
        }
    }
}
