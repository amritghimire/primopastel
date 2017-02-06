package com.amrit.primepastel;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefManager = new PrefManager(this);
        if (!prefManager.isFirstTimeLaunch()) {
                startActivity(new Intent(this,MainActivity.class));
                finish();
            }

        setContentView(R.layout.activity_form);

    }

    public void submit(View view) {
        String name=((EditText) findViewById(R.id.your_full_name)).getText().toString();
        String email=((EditText) findViewById(R.id.your_email_address)).getText().toString();
        String password=((EditText) findViewById(R.id.create_new_password)).getText().toString();
        if(name.isEmpty()||email.isEmpty()||password.isEmpty()){
            ((TextView) findViewById(R.id.mesa)).setText("Error");
        }else {
            prefManager.setNAME(name);
            prefManager.setEMAIL(email);
            prefManager.setPASSWORD(password);
            prefManager.setFirstTimeLaunch(false);
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }

    }
}
