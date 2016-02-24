package com.example.ronak.myapplication3calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, divide, back, clear, equal;
    float operand1=0, operand2=0, result=0;
    char operator;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equateIds();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                operand1 = Float.parseFloat(temp);
                operator = '+';
                tv.setText(temp+"+");
                tv.setText("");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                if(temp.equals(""))
                    tv.setText("-"+temp);
                else {
                    operand1 = Float.parseFloat(temp);
                    operator = '-';
                    tv.setText(temp + "-");
                    tv.setText("");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                operand1 = Float.parseFloat(temp);
                operator = '*';
                tv.setText(temp+"*");
                tv.setText("");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                operand1 = Float.parseFloat(temp);
                operator = '/';
                tv.setText(temp+"/");
                tv.setText("");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                tv.setText(temp.substring(0,temp.length()-1));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = tv.getText().toString();
                operand2 = Float.parseFloat(temp);
                switch(operator){
                    case '+':
                        result = operand1 + operand2;
                        tv.setText(String.valueOf(result));
                        break;
                    case '-':
                        result = operand1 - operand2;
                        tv.setText(String.valueOf(result));
                        break;
                    case '*':
                        result = operand1 * operand2;
                        tv.setText(String.valueOf(result));
                        break;
                    case '/':
                        result = operand1 / operand2;
                        tv.setText(String.valueOf(result));
                        break;
                }

            }
        });
    }
    protected void equateIds(){
        tv = (TextView)findViewById(R.id.tv);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        back = (Button)findViewById(R.id.back);
        clear = (Button)findViewById(R.id.clear);
        equal = (Button)findViewById(R.id.equal);
    }
}
