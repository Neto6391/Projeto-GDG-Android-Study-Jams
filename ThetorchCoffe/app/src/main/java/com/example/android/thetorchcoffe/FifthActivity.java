package com.example.android.thetorchcoffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    /*
     *Return to Intent 2 and this Third Activity, have One Test logic for User choice
     * True is shared for variable Global icecream On this manifest GB, and shares for another variable
     * hasIceCream. When closes this Intent for finish
     */
    public void returnSecondActivity(View view){
        CheckBox cafeCheckBox = (CheckBox) findViewById(R.id.checkox_3);
        boolean hasIceCream = cafeCheckBox.isChecked();
        GlobalPrice GB = (GlobalPrice) getApplicationContext();
        GB.setHasIcecream(hasIceCream);

        finish();
    }


}
