package com.example.healthandsocial;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Fevertester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fevertester);
        LottieAnimationView lti = findViewById(R.id.button);
        LottieAnimationView fine=findViewById(R.id.fine);
        TextView tv = findViewById(R.id.textView);
        EditText ed = findViewById(R.id.editTextTextPersonName);
        lti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int temp = Integer.parseInt(ed.getText().toString());
                    String x;
                    if (temp > 100) {
                        x = "High Fever";
                        fine.setAnimation(R.raw.high);
                        fine.playAnimation();
                    } else if (temp > 90 && temp <= 100) {
                        x = "Moderate Fever";
                        fine.setAnimation(R.raw.mod);
                        fine.playAnimation();
                    } else {
                        x = "Fine";
                        fine.setAnimation(R.raw.fine);
                        fine.playAnimation();
                    }
                    tv.setText(x);
                }
                catch (Exception E){
                    Toast.makeText(Fevertester.this,"Please Enter A Value ",Toast.LENGTH_SHORT).show();
                }
                }
        });
     }
    }
