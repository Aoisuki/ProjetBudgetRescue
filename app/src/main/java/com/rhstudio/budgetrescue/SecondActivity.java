package com.rhstudio.budgetrescue;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {
    private SecondActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.activity = this;

        Button b = (Button) findViewById(R.id.button2);
        Button b2 = (Button) findViewById(R.id.button7);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CustomPopUp customPopUp = new CustomPopUp(activity);
                customPopUp.build();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openParametre();

            }
        });
    }
    private void openParametre(){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}

