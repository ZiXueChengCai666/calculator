package com.example.wufan.calculator;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static public String str = "";
    static public String strTemp;
    static public double num1 = 0;
    static public double num2 = 0;
    static public double Result;
    static public int op = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button0 = (Button) findViewById(R.id.button0);
        Button buttonJia = (Button) findViewById(R.id.buttonJia);
        Button buttonJian = (Button) findViewById(R.id.buttonJian);
        Button buttonCheng = (Button) findViewById(R.id.buttonCheng);
        Button buttonChu = (Button) findViewById(R.id.buttonChu);
        Button buttonDian = (Button) findViewById(R.id.buttonDian);
        Button buttonDeng = (Button) findViewById(R.id.buttonDeng);
        Button buttonHou = (Button) findViewById(R.id.buttonHou);
        Button buttonQing = (Button) findViewById(R.id.buttonQing);
        Button buttonJiaJian = (Button) findViewById(R.id.buttonJiaJian);
        final EditText textViewResult = (EditText) findViewById(R.id.Result);
        final EditText textViewInput = (EditText) findViewById(R.id.Putin);
        str = textViewInput.getText().toString();
        textViewInput.setFocusable(false);
        textViewResult.setFocusable(false);
        textViewInput.setHorizontallyScrolling(true);
        textViewResult.setHorizontallyScrolling(true);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String str = textViewInput.getText().toString();
                //if (str.length() < 8)
                str += "1";
                textViewInput.setText(str);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (str.length() < 8)
                str += "2";
                textViewInput.setText(str);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "3";
                textViewInput.setText(str);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "4";
                textViewInput.setText(str);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "5";
                textViewInput.setText(str);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   if (str.length() < 8)
                str += "6";
                textViewInput.setText(str);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "7";
                textViewInput.setText(str);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "8";
                textViewInput.setText(str);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (str.length() < 8)
                str += "9";
                textViewInput.setText(str);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("0") && str.length()==1)
                    return;
                str += "0";
                textViewInput.setText(str);
            }
        });
        buttonQing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = "";
                textViewInput.setText(str);
                textViewResult.setText(str);
            }
        });

        buttonHou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!str.equals(""))
                    str = str.substring(0, str.length() - 1);
                textViewInput.setText(str);
            }
        });
        buttonDian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if (str.length() < 7) {
                if (str.indexOf(".") != -1) {
                }
                else {
                    if (str.equals(""))//如果开始为0，
                        str += "0.";
                    else
                        str += '.';
                }
                //}
                textViewInput.setText(str);
            }
        });

        buttonJiaJian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if (str.length() < 8) {
                if (str.indexOf('-') == -1) {
                    textViewInput.setText('-' + str);
                    str = '-' + str;
                } else {
                    str = str.replace("-", "");
                    textViewInput.setText(str.replace("-", ""));
                }
                //  }
            }
        });

        buttonJia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (str.equals("") && textViewResult.getText().toString() != "") {
                    op = 1;
                    return;
                }
                if (str.equals("") && textViewResult.getText().toString() == "") {
                    return;
                }
                if(str.equals("-"))
                    return;
                str = textViewInput.getText().toString();
                num1 = Double.valueOf(str);
                str = "";
                op = 1;

            }
        });

        buttonJian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.equals("") && textViewResult.getText().toString() != "") {
                    op = 2;
                    return;
                }
                if (str.equals("") && textViewResult.getText().toString() == "") {
                    return;
                }
                if(str.equals("-"))
                    return;
                str = textViewInput.getText().toString();
                num1 = Double.valueOf(str);
                str = "";
                op = 2;
            }
        });

        buttonCheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.equals("") && textViewResult.getText().toString() != "") {
                    op = 3;
                    return;
                }
                if (str.equals("") && textViewResult.getText().toString() == "") {
                    return;
                }
                if(str.equals("-"))
                    return;
                str = textViewInput.getText().toString();
                num1 = Double.valueOf(str);
                str = "";
                op = 3;
            }
        });

        buttonChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.equals("") && textViewResult.getText().toString() != "") {
                    op = 4;
                    return;
                }
                if (str.equals("") && textViewResult.getText().toString() == "") {
                    return;
                }
                if(str.equals("-"))
                    return;
                str = textViewInput.getText().toString();
                num1 = Double.valueOf(str);
                str = "";

                op = 4;
            }
        });


        buttonDeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Deng = textViewInput.getText().toString();
                if (Deng.equals("") || op == 0) {
                    return;
                }
                if(Deng.equals("-"))
                    return;
                num2 = Double.valueOf(Deng);

                switch (op) {
                    case 1:
                        Result = num1 + num2;
                        break;
                    case 2:
                        Result = num1 - num2;
                        break;
                    case 3:
                        Result = num1 * num2;
                        break;
                    case 4:
                        Result = num1 / num2;
                        break;

                }
                String s1 = String.format("%.4f", Result);
                if (s1.indexOf(".") > 0) {
                    //正则表达
                    s1 = s1.replaceAll("0+?$", "");//去掉后面无用的零
                    s1 = s1.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
                }
                textViewResult.setText(s1);
                num1 = Double.valueOf(s1.toString());
                num2 = 0;
                str = "";
                op = 0;
                textViewInput.setText(str);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        int id = item.getItemId();
        switch (id) {
            case R.id.Jin:
                intent.setClass(MainActivity.this,jinzhiActivity.class);
                startActivity(intent);
                break;
            case R.id.San:
                intent.setClass(MainActivity.this,sanjiaohanshuActivity.class);
                startActivity(intent);
                break;
            case R.id.Dan:
                intent.setClass(MainActivity.this,DanweizhuanhuanActivity.class);
                startActivity(intent);

        }

        return super.onOptionsItemSelected(item);

    }








}



