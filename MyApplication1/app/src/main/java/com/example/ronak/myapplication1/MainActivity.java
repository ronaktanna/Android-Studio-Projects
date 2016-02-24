package com.example.ronak.myapplication1;

        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    TextView tv11;
    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Linking IDs */
        et1 = (EditText)findViewById(R.id.et1);
        tv11 = (TextView)findViewById(R.id.tv1);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);

        //Code


        b1.setOnClickListener(new View.OnClickListener() {//Change size
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                tv11.setText("You entered: "+s);
                tv11.setTextSize(12);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {//Change color
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                tv11.setText("You entered: "+s);
                int a,b,c;
                a = (int)(Math.random()*255+1);
                b = (int)(Math.random()*255+1);
                c = (int)(Math.random()*255+1);
                tv11.setTextColor(Color.rgb(a,b,c));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {//Change font
            @Override
            public void onClick(View v) {
                String s = et1.getText().toString();
                tv11.setText("You entered: "+s);
                tv11.setTypeface(Typeface.DEFAULT_BOLD);
            }
        });
    }
}

