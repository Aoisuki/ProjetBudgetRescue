package com.rhstudio.budgetrescue;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import static android.R.style.Theme_Holo_Light_Dialog;

public class CustomPopUp extends Dialog {
    //fields

    private String valeur, nom;
    private TextView textView6, textView7;
    private EditText editText3, editText4;
    private Button button5, button6;

    //constructor
    public CustomPopUp(Activity activity)
    {
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.activity_ajouter_pop_up);

        this.valeur = "Valeur :";
        this.nom = "Nom :";
        this.textView6 = findViewById(R.id.textView6);
        this.editText3 = findViewById(R.id.editText3);
        this.textView7 = findViewById(R.id.textView7);
        this.editText4 = findViewById(R.id.editText4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);

    }

    public Button getOkButton(){ return button5; }

    public Button getAnnulerButton(){ return button6; }

    public void build(){
        show();
        textView6.setText(valeur);
        textView7.setText(nom);
    }
}
