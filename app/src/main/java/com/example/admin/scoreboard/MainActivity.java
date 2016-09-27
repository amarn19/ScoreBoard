package com.example.admin.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus3(View v)
    {
        switch (v.getId()) {
            case R.id.a1:
                scoreA+=3;
                display(1,scoreA);
                break;
            case R.id.b1:
                scoreB+=3;
                display(2,scoreB);
                break;
        }
    }
    public void plus2(View v)
    {
        switch (v.getId()) {
            case R.id.a2:
                scoreA+=2;
                display(1,scoreA);
                break;
            case R.id.b2:
                scoreB+=2;
                display(2,scoreB);
                break;
        }
    }
    public void plus1(View v)
    {
        switch (v.getId()) {
            case R.id.a3:
                scoreA+=1;
                display(1,scoreA);
                break;
            case R.id.b3:
                scoreB+=1;
                display(2,scoreB);
                break;
        }
    }
    public void display(int team,int a){
        switch (team)
        {
            case 1:TextView txt=(TextView)findViewById(R.id.scoreA);
                txt.setText(""+a);
                break;
            case 2:TextView txt1=(TextView)findViewById(R.id.scoreB);
                txt1.setText(""+a);
                break;
            case 3:TextView txt3=(TextView)findViewById(R.id.scoreA);
                txt3.setText(""+a);
                TextView txt4=(TextView)findViewById(R.id.scoreB);
                txt4.setText(""+a);
                break;
        }

    }
    public void reset(View v)
    {
        scoreA=0;
        scoreB=0;
        display(3,scoreA);
        display(3,scoreB);
    }
}
