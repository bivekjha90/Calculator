package com.example.bivek.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal,ten;
    EditText disp;
    float op1;
    float op2;
    String optr;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        add = (Button) findViewById(R.id.buttonadd);
        sub = (Button) findViewById(R.id.buttonsub);
        mul = (Button) findViewById(R.id.buttonmul);
        div = (Button) findViewById(R.id.buttondiv);
        cancel = (Button) findViewById(R.id.buttonC);
        equal = (Button) findViewById(R.id.buttoneql);
        disp = (EditText) findViewById(R.id.edt1);

        ten=(Button)findViewById(R.id.button10);
        try {
            one.setOnClickListener(this);
            two.setOnClickListener(this);
            three.setOnClickListener(this);
            four.setOnClickListener(this);
            five.setOnClickListener(this);
            six.setOnClickListener(this);
            seven.setOnClickListener(this);
            eight.setOnClickListener(this);
            nine.setOnClickListener(this);
            zero.setOnClickListener(this);
            cancel.setOnClickListener(this);
            add.setOnClickListener(this);
            sub.setOnClickListener(this);
            mul.setOnClickListener(this);
            div.setOnClickListener(this);
            equal.setOnClickListener(this);
            ten.setOnClickListener(this);
        }
        catch (Exception e)
        {

        }
    }

    public void operation() {
        if (optr.equals("+")) {
            op2 = Float.parseFloat(disp.getText().toString());
            disp.setText(" ");
            op1 = op1 + op2;
            disp.setText("Result : " + Float.toString(op1));
        } else if (optr.equals("-")) {
            op2 = Float.parseFloat(disp.getText().toString());
            disp.setText(" ");
            op1 = op1 - op2;
            disp.setText("Result : " + Float.toString(op1));
        } else if (optr.equals("*")) {
            op2 = Float.parseFloat(disp.getText().toString());
            disp.setText(" ");
            op1 = op1 * op2;
            disp.setText("Result : " + Float.toString(op1));
        } else if (optr.equals("/")) {
            op2 = Float.parseFloat(disp.getText().toString());
            disp.setText(" ");
            op1 = op1 / op2;
            disp.setText("Result : " + Float.toString(op1));
        }
    }

    @Override
    public void onClick(View arg0) {
        Editable str = disp.getText();
        switch (arg0.getId()) {
            case R.id.button1:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.button2:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.button3:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.button4:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.button5:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.button6:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.button7:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.button8:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.button9:
                if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                }
                str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.button0:
                if(op2!=0)
                {
                    op2=0;
                    disp.setText(" ");
                }
                str=str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.buttonC:
                op1 = 0;
                op2 = 0;
                disp.setText(" ");
                disp.setHint("Perform Operation :)");
                break;
            case R.id.button10:
                if(op2!=0)
                {
                    op2=0;
                    disp.setText(" ");
                }
                str=str.append(ten.getText());
                disp.setText(str);
                break;
            case R.id.buttonadd:
                optr = "+";
                if (op1 == 0) {
                    op1 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                } else {
                    op2 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                    op1 = op1 + op2;
                    disp.setText("Result : " + Float.toString(op1));
                }
                break;
            case R.id.buttonsub:
                optr = "-";
                if (op1 == 0) {
                    op1 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                } else {
                    op2 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                    op1 = op1 - op2;
                    disp.setText("Result : " + Float.toString(op1));
                }
                break;
            case R.id.buttonmul:
                optr = "*";
                if (op1 == 0) {
                    op1 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                } else {
                    op2 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                    op1 = op1 * op2;
                    disp.setText("Result : " + Float.toString(op1));
                }
                break;
            case R.id.buttondiv:
                optr = "/";
                if (op1 == 0) {
                    op1 = Float.parseFloat(disp.getText().toString());
                    disp.setText(" ");
                } else if (op2 != 0) {
                    op2 = 0;
                    disp.setText(" ");
                } else {
                    op2 = Float.parseFloat(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 / op2;
                    disp.setText("Result : " + Float.toString(op1));
                }
                break;
            case R.id.buttoneql:
                if (!optr.equals(null)) {
                    if (op2 != 0) {
                        if (optr.equals("+")) {
                            disp.setText(" "); /*op1 = op1 + op2;*/
                            disp.setText("Result : " + Float.toString(op1));
                        } else if (optr.equals("-")) {
                            disp.setText(" ");/* op1 = op1 - op2;*/
                            disp.setText("Result : " + Float.toString(op1));
                        } else if (optr.equals("*")) {
                            disp.setText(" ");/* op1 = op1 * op2;*/
                            disp.setText("Result : " + Float.toString(op1));
                        } else if (optr.equals("/")) {
                            disp.setText(" ");
                            /* op1 = op1 / op2;*/
                            disp.setText("Result : " + Float.toString(op1));
                        }
                    } else {
                        operation();
                    }
                }
                break;
        }
    }
}
