package com.example.scoretable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView blueMain, bluePen, redMain, redPen;
    Button blue, red, reset;
    Switch extraTime;
    boolean exTime=false;
    int blueCount=0, redCount, bluePenalty, redPenalty;

    public void setToZerpo(){
        blueMain.setText("0");
        bluePen.setText("0");
        redMain.setText("0");
        redPen.setText("0");
        blueCount=0;
        redCount=0;
        bluePenalty=0;
        redPenalty=0;
        exTime=false;
        extraTime.setChecked(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaration of buttons
        blue =(Button) findViewById(R.id.button);
        red = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.button3);
        blueMain = findViewById(R.id.textView3);
        bluePen = (TextView)findViewById(R.id.textView4);
        redPen = findViewById(R.id.textView5);
        redMain = findViewById(R.id.textView2);
        extraTime = findViewById(R.id.switch1);
        setToZerpo();

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!exTime){
                    blueCount++;
                    blueMain.setText(blueCount+"");
                }
                else{
                    bluePenalty++;
                    bluePen.setText(bluePenalty+"");
                }
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!exTime){
                    redCount++;
                    redMain.setText(redCount+"");
                }
                else{
                    redPenalty++;
                    redPen.setText(redPenalty+"");
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setToZerpo();

            }
        });
        extraTime.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                exTime= b;
            }
        });
    }
}
