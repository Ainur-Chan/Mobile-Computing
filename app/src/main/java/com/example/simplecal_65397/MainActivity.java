package com.example.simplecal_65397;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.c2_createemulator.R;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    TextView txtControl;
    Button Add;
    Button Subtract;
    Button Multiply;
    Button Divide;
    Button Equal;
    Button Reset;

    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;

    final char ADDITION = '+';
    final char SUBSTRACTION ='-';
    final char MULTIPLICATION ='*';
    final char DIVISION ='/';
    final char EQUALS = 0;
    double val1 = Double.NaN;
    double val2;
    char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        functbtn();

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtControl.setText(txtControl.getText().toString() + "9");
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                txtResult.setText(String.valueOf(val1) + "+");
                txtControl.setText(null);
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBSTRACTION;
                txtResult.setText(String.valueOf(val1) + "-");
                txtControl.setText(null);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                txtResult.setText(String.valueOf(val1) + "*");
                txtControl.setText(null);
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                txtResult.setText(String.valueOf(val1) + "/");
                txtControl.setText(null);
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUALS;
                txtResult.setText(txtResult.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                txtControl.setText(null);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtControl.getText().length() > 0){
                    CharSequence name = txtControl.getText().toString();
                    txtControl.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    txtControl.setText(null);
                    txtResult.setText(null);
                }
            }
        });

    }

    private void functbtn(){
        txtResult = (TextView)findViewById(R.id.txt_result);
        txtControl = (TextView)findViewById(R.id.txt_control);
        Add = (Button)findViewById(R.id.btn_plus);
        Subtract = (Button) findViewById(R.id.btn_minus);
        Multiply = (Button) findViewById(R.id.btn_multiply);
        Divide = (Button) findViewById(R.id.btn_divide);
        Equal = (Button)findViewById(R.id.btn_equal);
        Reset = (Button)findViewById(R.id.btn_reset);

        num0 = (Button)findViewById(R.id.btn_0);
        num1 = (Button)findViewById(R.id.btn_1);
        num2 = (Button)findViewById(R.id.btn_2);
        num3 = (Button)findViewById(R.id.btn_3);
        num4 = (Button)findViewById(R.id.btn_4);
        num5 = (Button)findViewById(R.id.btn_5);
        num6 = (Button)findViewById(R.id.btn_6);
        num7 = (Button)findViewById(R.id.btn_7);
        num8 = (Button)findViewById(R.id.btn_8);
        num9 = (Button)findViewById(R.id.btn_9);

    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(txtControl.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;

                case SUBSTRACTION:
                    val1 = val1 - val2;
                    break;

                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;

                case DIVISION:
                    val1 = val1 / val2;
                    break;

                case EQUALS:
                    break;
            }
        }

        else{
            val1 = Double.parseDouble(txtControl.getText().toString());
        }
    }
}