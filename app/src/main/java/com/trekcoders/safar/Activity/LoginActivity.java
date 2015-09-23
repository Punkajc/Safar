package com.trekcoders.safar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.trekcoders.safar.R;

public class LoginActivity extends AppCompatActivity {

    EditText user, password;
    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.username_edittext);
        password = (EditText)findViewById(R.id.password_edittext);
        login = (Button)findViewById(R.id.btn_login);
        register = (Button)findViewById(R.id.btn_register);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = user.getText().toString();
                String pass = password.getText().toString();

                if(username.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this,"You must fill both the credentials",Toast.LENGTH_SHORT).show();

                else {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
