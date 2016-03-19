package com.example.android.thetorchcoffe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    /*
     *Return to Intent 2 and this Third Activity, have One Test logic for User choice
     * True is shared for variable Global cafe On this manifest GB, and shares for another variable
     * hasCafe. When closes this Intent for finish
     */
    public void returnSecondActivity(View View){
        CheckBox cafeCheckBox = (CheckBox) findViewById(R.id.checkox_1);
        boolean hasCafe = cafeCheckBox.isChecked();
        GlobalPrice GB = (GlobalPrice) getApplicationContext();
        GB.setHasCoffe( hasCafe );

        finish();
    }

}
