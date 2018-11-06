package com.gataulova.example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    TextView text1;
    TextView text2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 =(TextView) findViewById(R.id.text2);

        View.OnClickListener BtrOk = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                text1.setText("Hello World");
                button.setBackgroundColor(Color.BLUE);
                text2.setText("Click №" + new Integer(i).toString());
                i = i+1;
                if(i % 2 == 0)
                {
                    button.setBackgroundColor(Color.GREEN);
                }
            }
        };

        button.setOnClickListener(BtrOk);

    }
}
