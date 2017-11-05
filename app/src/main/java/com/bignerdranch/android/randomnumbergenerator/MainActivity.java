package com.bignerdranch.android.randomnumbergenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Button mD20;
    private Button mD6;
    private Button mD8;
    private Button mD10;
    private TextView mRandomNumber;
    private EditText mMin;
    private EditText mMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMin = (EditText)findViewById(R.id.min);
        mMin.setText("1");
        mMax = (EditText)findViewById(R.id.max);
        mMax.setText("10");
        mRandomNumber = (TextView)findViewById(R.id.number);

        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mMin.getText().toString().equals("") && !mMax.getText().toString().equals(""))
                {

                    int min = Integer.parseInt(mMin.getText().toString());
                    int max = Integer.parseInt(mMax.getText().toString());
                    if(max > min)
                    {
                        Random r = new Random();
                        int random_number = r.nextInt(max - min + 1) + min;
                        mRandomNumber.setText(Integer.toString(random_number));
                    }
                    else
                    {
                        Toast.makeText(getBaseContext(), "Max is less than min", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Fill in all the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mD20 = (Button)findViewById(R.id.D20);
        mD20.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mMin.setText("1");
                mMax.setText("20");
                Toast.makeText(getBaseContext(), "D20 selected", Toast.LENGTH_SHORT).show();
            }
        });

        mD8 = (Button)findViewById(R.id.D8);
        mD8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mMin.setText("1");
                mMax.setText("8");
                Toast.makeText(getBaseContext(), "D8 selected", Toast.LENGTH_SHORT).show();
            }
        });

        mD6 = (Button)findViewById(R.id.one_die);
        mD6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                mMin.setText("1");
                mMax.setText("6");
                Toast.makeText(getBaseContext(), "D6 selected", Toast.LENGTH_SHORT).show();
            }
        });

        mD10 = (Button)findViewById(R.id.D10);
        mD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMin.setText("1");
                mMax.setText("10");
                Toast.makeText(getBaseContext(), "D10 selected", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
