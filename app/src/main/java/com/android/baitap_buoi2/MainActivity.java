package com.android.baitap_buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvScore1, tvScore2;
    private Button btnScoreA1, btnScoreA2, btnScoreA3, btnScoreB1, btnScoreB2, btnScoreB3, btnReset;
    private int COUNT1 = 0;
    private int COUNT2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        init();
    }

    private void init() {
        btnScoreA1.setOnClickListener(this);
        btnScoreA2.setOnClickListener(this);
        btnScoreA3.setOnClickListener(this);
        btnScoreB1.setOnClickListener(this);
        btnScoreB2.setOnClickListener(this);
        btnScoreB3.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnScoreA1:
                doClickScoreA1();
                break;
            case R.id.btnScoreA2:
                doClickScoreA2();
                break;
            case R.id.btnScoreA3:
                doClickScoreA3();
                break;
            case R.id.btnScoreB1:
                doClickScoreB1();
                break;
            case R.id.btnScoreB2:
                doClickScoreB2();
                break;
            case R.id.btnScoreB3:
                doClickScoreB3();
                break;
            case R.id.btnReset:
                doClickReset();
                break;
        }
    }

    private void doClickReset() {
        tvScore1.setText("0");
        tvScore2.setText("0");
        resetScore();
    }

    private void doClickScoreB3() {
        COUNT2+=3;
        updateScore2();
    }

    private void doClickScoreB2() {
        COUNT2+=2;
        updateScore2();
    }

    private void doClickScoreB1() {
        COUNT2++;
        updateScore2();
    }

    private void doClickScoreA3() {
        COUNT1+=3;
        updateScore1();
    }

    private void doClickScoreA2() {
        COUNT1+=2;
        updateScore1();
    }

    private void doClickScoreA1() {
        COUNT1++;
        updateScore1();

    }

    private void updateScore1(){
        tvScore1.setText(String.valueOf(COUNT1));
    }

    private void updateScore2(){
        tvScore2.setText(String.valueOf(COUNT2));
    }

    private void resetScore(){
       COUNT2=0;
       COUNT1=0;
    }

    private void mapping() {
        tvScore1 = findViewById(R.id.tvScore1);
        tvScore2 = findViewById(R.id.tvScore2);
        btnScoreA1 = findViewById(R.id.btnScoreA1);
        btnScoreA2 = findViewById(R.id.btnScoreA2);
        btnScoreA3 = findViewById(R.id.btnScoreA3);
        btnScoreB1 = findViewById(R.id.btnScoreB1);
        btnScoreB2 = findViewById(R.id.btnScoreB2);
        btnScoreB3 = findViewById(R.id.btnScoreB3);
        btnReset = findViewById(R.id.btnReset);
    }
}
