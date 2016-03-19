package com.example.android.thetorchcoffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {
    int price = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        //Have on Event for Click Button for set id and calls method resultadoConta,
        Button button = (Button) findViewById(R.id.resultado_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                resultadoConta();
            }
        });


    }
    //When the button have pressionate Variable Global on the Manifest is called onde getPrice for ApplicationContext and shares for the variable price
    public void resultadoConta(){
        GlobalPrice GB = (GlobalPrice) getApplicationContext();
        int price = GB.getPrice();

        //price is show up on the TextView on the method contaTextView, show String more price cocatened.
        TextView contaTextView = (TextView) findViewById(R.id.resultado_text_view);
        contaTextView.setText("" + price);

    }

}
