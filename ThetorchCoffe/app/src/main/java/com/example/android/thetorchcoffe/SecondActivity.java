package com.example.android.thetorchcoffe;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = (Button) findViewById(R.id.click_view_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click for go to Sixth Activity
                startSixthActivity( v );
            }
        });
    }


     /*
    *
    * Start new Intent 03 and put variable Global
    */
    public void startThirdActivity(View view) {
        Intent thirdActivity = new Intent(this, ThirdActivity.class);
        startActivity(thirdActivity);
    }

     /*
    * Start new Intent 04 and put variable Global
    */
    public void startFourthActivity(View view) {
        Intent fourthActivity = new Intent(this, FourthActivity.class);
        startActivity(fourthActivity);
    }

     /*
    *
    * Start new Intent 05 and put variable Global
    */

    public void startFifthActivity(View view) {
        Intent fifthActivity = new Intent(this, FifthActivity.class);
        startActivity(fifthActivity);
    }

    /*
    *
    * Start new Intent 06 and put variable Global
    */

    public void startSixthActivity(View view){
        Intent sixthActivity = new Intent(this, SixthActivity.class);
        startActivity(sixthActivity);
    }
}

