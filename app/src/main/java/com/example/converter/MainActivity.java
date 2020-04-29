package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button conMileToKm = (Button) findViewById(R.id.conMilesToKm);
        conMileToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText miles_input = (EditText) findViewById(R.id.miles_input);
                EditText km_input= (EditText) findViewById(R.id.km_input);
                try {
                    double vMiles = Double.valueOf(miles_input.getText().toString());
                    double vKm = vMiles / 0.6213;
                    DecimalFormat formalVal = new DecimalFormat("##.#####");
                    km_input.setText(formalVal.format(vKm));
                }
                catch(NumberFormatException e){

                }
            }
        });

        Button conKmToMile = (Button) findViewById(R.id.conKmToMiles);
         conKmToMile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText miles_input = (EditText) findViewById(R.id.miles_input);
                EditText km_input = (EditText) findViewById(R.id.km_input);
                try {
                   
                    double vKm =Double.valueOf(km_input.getText().toString());
                    double vMiles =   vKm * 0.6213;
                    DecimalFormat formalVal = new DecimalFormat("##.#####");
                    miles_input.setText(formalVal.format(vMiles));
                }
                catch(NumberFormatException e){

                }
            }
        });




    }


}
