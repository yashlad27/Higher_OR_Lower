package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int CompNum;
    public void guessNumber(View view){
        Log.i("info", "Button Pressed!");

        EditText editNum = (EditText) findViewById(R.id.inputNumber);

//        int guessNum = Integer.parseInt(String.valueOf(editNum));
        int guessNum = Integer.parseInt(editNum.getText().toString());
        String message;
        if(CompNum>guessNum){
            //System.out.println("Higher");
            //Toast.makeText(this, "Higher", Toast.LENGTH_LONG).show();
            message = "Higher";
        }else if(CompNum == guessNum){
            //System.out.println("Correct Guess");
            //Toast.makeText(this, "Correct Guess", Toast.LENGTH_LONG).show();
            message = "Correct Guess!";
        }else{
            //System.out.println("Lower");
            //Toast.makeText(this, "Lower", Toast.LENGTH_LONG).show();
            message = "Lower";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        //Log.i("Value User", editNum.getText().toString());

        //Log.i("info", Integer.toString(CompNum));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        CompNum = rand.nextInt(20)+1; // Gives n such that 0 <= n < 20
    }
}