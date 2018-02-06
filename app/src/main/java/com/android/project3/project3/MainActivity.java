package com.android.project3.project3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1Q1;
    RadioButton radioButton2Q1;
    RadioButton radioButton3Q1;

    int s1=0,s2=0,s3=0,s4=0,s5=0;
    int total=50;

    RadioButton radioButton1Q2;
    RadioButton radioButton2Q2;

    CheckBox checkBox1Q3;
    CheckBox checkBox2Q3;
    CheckBox checkBox3Q3;
    CheckBox checkBox4Q3;

    EditText editTextQ4;

    RadioButton radioButton1Q5;
    RadioButton radioButton2Q5;
    RadioButton radioButton3Q5;

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkedQues1(View view)
    {
        radioButton1Q1 = (RadioButton) findViewById(R.id.rb1_q_1);
        radioButton2Q1 = (RadioButton)findViewById(R.id.rb2_q_1);
        radioButton3Q1 = (RadioButton) findViewById(R.id.rb3_q_1);
        if(radioButton1Q1.isChecked())
        {
            s1=10;
        }
        else
        {
            s1=0;
        }

    }

    public void checkedQues2(View view)
    {
        radioButton1Q2 = (RadioButton) findViewById(R.id.rb1_q_2);
        radioButton2Q2 = (RadioButton)findViewById(R.id.rb2_q_2);
        if(radioButton2Q2.isChecked())
        {
            s2=10;
        }
        else
        {
            s2=0;
        }

    }

    public void checkedQues3(View view)
    {
        checkBox1Q3 = (CheckBox) findViewById(R.id.cb1_q3);
        checkBox2Q3 = (CheckBox) findViewById(R.id.cb2_q3);
        checkBox3Q3 = (CheckBox) findViewById(R.id.cb3_q3);
        checkBox4Q3 = (CheckBox) findViewById(R.id.cb4_q3);
        if(checkBox1Q3.isChecked() && checkBox2Q3.isChecked() && checkBox4Q3.isChecked())
        {
            s3=10;
        }
        if(checkBox3Q3.isChecked())
        {
            s3=0;
        }
    }

    public void checkedQues5(View view)
    {
        radioButton1Q5 = (RadioButton) findViewById(R.id.rb1_q_5);
        radioButton2Q5 = (RadioButton) findViewById(R.id.rb2_q_5);
        radioButton3Q5 = (RadioButton) findViewById(R.id.rb3_q_5);

        if(radioButton3Q5.isChecked())
        {
            s5=10;
        }
        else
        {
            s5=0;
        }
    }


    public void submitButton(View view)
    {
        editTextQ4 = (EditText) findViewById(R.id.ET_ques4);
        String ans4 = editTextQ4.getText().toString();
        if(ans4.toLowerCase().equals("cascading style sheets"))
        {
            s4=10;
        }
        else
        {
            s4=0;
        }
        if(s1+s2+s3+s4+s5==total)
        {

            Toast.makeText(MainActivity.this,"Congrats, your score is 50/50", Toast.LENGTH_SHORT).show();
        }
        else
        {
            int wrongTotal=s1+s2+s3+s4+s5;
            Toast.makeText(MainActivity.this,"Sorry, your score is " + wrongTotal + "/50", Toast.LENGTH_SHORT).show();
        }

    }

    public void resetButton(View view)
    {
        s1=0;
        s2=0;
        s3=0;
        s4=0;
        s5=0;

        radioGroup1 = (RadioGroup) findViewById(R.id.radiogroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radiogroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radiogroup3);

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();

        checkBox1Q3 = (CheckBox) findViewById(R.id.cb1_q3);
        checkBox2Q3 = (CheckBox) findViewById(R.id.cb2_q3);
        checkBox3Q3 = (CheckBox) findViewById(R.id.cb3_q3);
        checkBox4Q3 = (CheckBox) findViewById(R.id.cb4_q3);

        checkBox1Q3.setChecked(false);
        checkBox2Q3.setChecked(false);
        checkBox3Q3.setChecked(false);
        checkBox4Q3.setChecked(false);
         EditText editText2Q4;
        editText2Q4 = (EditText) findViewById(R.id.ET_ques4);
        editText2Q4.setText("");
    }


}
