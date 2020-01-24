package com.example.randomdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.Button;
import android.view.View;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollDices = findViewById(R.id.btnRoll);
        final ImageView dicesu = findViewById(R.id.picDie);

        rollDices.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int value = randomDiceValue();

                        int Ris1 = getResources().getIdentifier("dot_"+ value, "drawable",
                                "com.example.randomdice");

                        dicesu.setImageResource(Ris1);

                    }
                });

    }

    public static int randomDiceValue() {
        return RANDOM.nextInt(6)+1;

    }

}
