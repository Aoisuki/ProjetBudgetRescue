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

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CustomPopUp customPopUp = new CustomPopUp(activity);
                customPopUp.build();

            }
        });

    }
}

