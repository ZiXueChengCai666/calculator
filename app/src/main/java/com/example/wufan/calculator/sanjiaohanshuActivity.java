package com.example.wufan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sanjiaohanshuActivity extends AppCompatActivity {

    static String str = "";
    static String strNum = "";
    static int op = 0;
    static double num1=0 ,num2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjiaohanshu);

        Button button1 = (Button) findViewById(R.id.buttonSan1);
        Button button2 = (Button) findViewById(R.id.buttonSan2);
        Button button3 = (Button) findViewById(R.id.buttonSan3);
        Button button4 = (Button) findViewById(R.id.buttonSan4);
        Button button5 = (Button) findViewById(R.id.buttonSan5);
        Button button6 = (Button) findViewById(R.id.buttonSan6);
        Button button7 = (Button) findViewById(R.id.buttonSan7);
        Button button8 = (Button) findViewById(R.id.buttonSan8);
        Button button9 = (Button) findViewById(R.id.buttonSan9);
        Button button0 = (Button) findViewById(R.id.buttonSan0);
        Button buttons = (Button) findViewById(R.id.buttonSanSin);
        Button buttonc = (Button) findViewById(R.id.buttonSanCos);
        Button buttonDian = (Button) findViewById(R.id.buttonSanDian);
        Button buttont = (Button) findViewById(R.id.buttonSanTan);
        Button buttonHou = (Button) findViewById(R.id.buttonSanHou);
        Button buttonQing = (Button) findViewById(R.id.buttonSanQing);
        Button buttonFan = (Button) findViewById(R.id.buttonSanFan);
        Button buttonSanDeng = (Button)findViewById(R.id.buttonSanDeng);

        final EditText textViewResult = (EditText) findViewById(R.id.Sanresult);
        final EditText textViewInput = (EditText) findViewById(R.id.Sanputin);
        str = textViewInput.getText().toString();
        textViewInput.setFocusable(false);
        textViewResult.setFocusable(false);
        textViewInput.setHorizontallyScrolling(true);
        textViewResult.setHorizontallyScrolling(true);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("0") && str.length()==1)
                    return;
                str+="0";
                strNum+="0";
                textViewInput.setText(str);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="1";
                strNum+="1";
                textViewInput.setText(str);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="2";
                strNum+="2";
                textViewInput.setText(str);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="3";
                strNum+="3";
                textViewInput.setText(str);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="4";
                strNum+="4";
                textViewInput.setText(str);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="5";
                strNum+="5";
                textViewInput.setText(str);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="6";
                strNum+="6";
                textViewInput.setText(str);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="7";
                strNum+="7";
                textViewInput.setText(str);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="8";
                strNum+="8";
                textViewInput.setText(str);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="9";
                strNum+="9";
                textViewInput.setText(str);
            }
        });

        buttonDian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (str.indexOf(".") != -1) {
                }
                else {
                    if (str.equals("")) {//如果开始为0，
                        str += "0.";
                        strNum +="0.";
                    }

                    else {
                        str += '.';
                        strNum +='.';
                    }
                }
                //}
                textViewInput.setText(str);
            }
        });

        buttonHou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = str;
                s = s.replaceAll(strNum,"");
                if(!strNum.equals("")) {
                    strNum = strNum.substring(0, strNum.length() - 1);
                    str = s + strNum;
                }
                textViewInput.setText(str);
            }
        });

        buttonQing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = "";
                strNum="";
                op = 0;
                textViewInput.setText(str);
                textViewResult.setText(str);
            }
        });

        buttonFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttons.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if(str.equals(""))
                                return;

                            str = textViewInput.getText().toString();
                            if(isOp(str) == false) {
                                str = "sin" + strNum;
                                op = 1;
                }
                else {
                    str = "sin" + strNum;
                    op = 1;
                }
                textViewInput.setText(str);
            }
        });


        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(str.equals(""))
                    return;

                str = textViewInput.getText().toString();
                if(isOp(str) == false) {
                    str = "cos" + strNum;
                    op = 2;
                }
                else {
                    str = "cos" + strNum;
                    op = 2;
                }
                textViewInput.setText(str);
            }
        });

        buttont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(str.equals(""))
                    return;

                str = textViewInput.getText().toString();
                if(isOp(str) == false) {
                    str = "tan" + strNum;
                    op = 3;
                }
                else {
                    str = "tan" + strNum;
                    op = 3;
                }
                textViewInput.setText(str);
            }
        });










        buttonSanDeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textViewInput.getText().toString().equals("")) {
                    switch (op) {
                        case 0:
                            break;
                        case 1:
                            num1 = Double.valueOf(strNum);
                            num2 = Math.sin(num1);
                            String s1 = String.format("%.4f", num2);
                            if (s1.indexOf(".") > 0) {
                                //正则表达
                                s1 = s1.replaceAll("0+?$", "");//去掉后面无用的零
                                s1 = s1.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
                            }
                            textViewResult.setText(s1);
                            break;
                        case 2:
                            num1 = Double.valueOf(strNum);
                            num2 = Math.cos(num1);
                            String s2 = String.format("%.4f", num2);
                            if (s2.indexOf(".") > 0) {
                                //正则表达
                                s2 = s2.replaceAll("0+?$", "");//去掉后面无用的零
                                s2 = s2.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
                            }
                            textViewResult.setText(s2);

                        case 3:
                            num1 = Double.valueOf(strNum);
                            num2 = Math.cos(num1);
                            String s3 = String.format("%.4f", num2);
                            if (s3.indexOf(".") > 0) {
                                //正则表达
                                s3 = s3.replaceAll("0+?$", "");//去掉后面无用的零
                                s3 = s3.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
                            }
                            textViewResult.setText(s3);


                    }
                    str = "";
                    strNum = "";
                    textViewInput.setText(str);

                    num2 = num1 = 0;
                }




            }
        });






    }

    protected  boolean isOp(String str)
    {
        boolean b = false;
        if(str.indexOf("sin") != -1)
            b = true;
        if(str.indexOf("cos") != -1)
            b = true;
        if(str.indexOf("tan") != -1)
            b = true;
        return b;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        int id = item.getItemId();
        switch (id) {
            case R.id.Zhu:
                intent.setClass(sanjiaohanshuActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.Jin2:
                intent.setClass(sanjiaohanshuActivity.this, jinzhiActivity.class);
                startActivity(intent);
                break;
            case R.id.Dan2:
                intent.setClass(sanjiaohanshuActivity.this, DanweizhuanhuanActivity.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);

    }
}
