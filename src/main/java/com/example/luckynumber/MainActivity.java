package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randonNum = new Random().nextInt(100);
    String rand = "" + randonNum;

    private TextView tvProgramm;
    private TextView winOrLose;
    private EditText numByPlayer;
    private Button tryBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvProgramm = findViewById(R.id.tvNumberProgramm);
        numByPlayer = findViewById(R.id.teByPlayer);
        tryBut = findViewById(R.id.btnTry);
        winOrLose = findViewById(R.id.tvWinOrLose);

    }

    public void onClick(View v)
    {
        randonNum = new Random().nextInt(100);
        int numb = Integer.parseInt(numByPlayer.getText().toString());
        tvProgramm.setText("Number: " + randonNum);

        if (numb == randonNum)
        {
            winOrLose.setText("win");
        }
        else {
            winOrLose.setText("lose");
        }
    }


}