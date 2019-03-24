package com.example.wufan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;

public class DanweizhuanhuanActivity extends AppCompatActivity {

    static String str = "";
    static int op = 0;
    static int locationR = 0;
    static int locationP = 0;






    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danweizhuanhuan);
        final EditText textViewDanR = (EditText) findViewById(R.id.editTextDanR);
        final EditText textViewDanP = (EditText) findViewById(R.id.editTextDanP);
        Button buttonChang = (Button)findViewById(R.id.buttonDanChang);
        Button buttonZhong = (Button)findViewById(R.id.buttonDanzhong);
        Button buttonMian = (Button)findViewById(R.id.buttonDanmian);
        Button buttonSu = (Button)findViewById(R.id.buttonDanSu);
        Button buttonShi = (Button)findViewById(R.id.buttonDanShi);

        Button button1 = (Button) findViewById(R.id.buttonDan1);
        Button button2 = (Button) findViewById(R.id.buttonDan2);
        Button button3 = (Button) findViewById(R.id.buttonDan3);
        Button button4 = (Button) findViewById(R.id.buttonDan4);
        Button button5 = (Button) findViewById(R.id.buttonDan5);
        Button button6 = (Button) findViewById(R.id.buttonDan6);
        Button button7 = (Button) findViewById(R.id.buttonDan7);
        Button button8 = (Button) findViewById(R.id.buttonDan8);
        Button button9 = (Button) findViewById(R.id.buttonDan9);
        Button button0 = (Button) findViewById(R.id.buttonDan0);
        Button buttonHou = (Button) findViewById(R.id.buttonDanHou);
        Button buttonQing = (Button) findViewById(R.id.buttonDanQing);
        Button buttonDian = (Button) findViewById(R.id.buttonDanDian);
        Button buttonFan = (Button) findViewById(R.id.buttonDanFan);
        Button buttonDeng = (Button)findViewById(R.id.buttonDanDeng);


        final Spinner spinner = (Spinner) findViewById(R.id.spannerR);
        final Spinner spinner1 = (Spinner)findViewById(R.id.spannerP);

        str = textViewDanP.getText().toString();

        /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ChangDu, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.ChangDu, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);*/

        textViewDanR.setFocusable(false);
        textViewDanP.setFocusable(false);
        textViewDanR.setHorizontallyScrolling(true);
        textViewDanP.setHorizontallyScrolling(true);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("0") && str.length()==1)
                    return;
                str+=0;
                textViewDanP.setText(str);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=1;
                textViewDanP.setText(str);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=2;
                textViewDanP.setText(str);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=3;
                textViewDanP.setText(str);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=4;
                textViewDanP.setText(str);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=5;
                textViewDanP.setText(str);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=6;
                textViewDanP.setText(str);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=7;
                textViewDanP.setText(str);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=8;
                textViewDanP.setText(str);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+=9;
                textViewDanP.setText(str);
            }
        });

        buttonHou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!str.equals(""))
                     str = str.substring(0,str.length()-1);
                textViewDanP.setText(str);
            }
        });

        buttonQing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = "";
                textViewDanP.setText("");
                textViewDanR.setText("");
            }
        });

        buttonDian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str.indexOf(".") != -1) {
                }
                else {
                    if (str.equals(""))//如果开始为0，
                        str += "0.";
                    else
                        str += '.';
                }

                textViewDanP.setText(str);
            }
        });

        buttonFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonDeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!textViewDanP.getText().toString().equals("")) {
                    String s = textViewDanP.getText().toString();
                    double num = Double.valueOf(s);
                    double result = 0;

                    switch (op) {
                        case 1://mianji
                            int[] mianji = {1, 2, 3, 6};
                            result = num * pow(100, mianji[locationP] - mianji[locationR]);
                            break;
                        case 2://changdu
                            int[] changdu = {1, 2, 3, 4, 7};
                            result = num * pow(10, changdu[locationP] - changdu[locationR]);
                            break;
                        case 3://sudu
                            int[] sudu = {1, 2};
                            result = num * pow(3.6, sudu[locationR] - sudu[locationP]);
                            break;
                        case 4://shijian
                            int[] shijian = {1, 2, 3};
                            result = num * pow(60, shijian[locationP] - shijian[locationR]);
                            break;
                        case 5://zhongliang
                            int[] zhongliang = {1, 2, 3, 4};
                            result = num * pow(1000, zhongliang[locationP] - zhongliang[locationR]);
                            break;
                    }
                    String s1 = String.format("%.4f", result);
                    if (s1.indexOf(".") > 0) {
                        //正则表达
                        s1 = s1.replaceAll("0+?$", "");//去掉后面无用的零
                        s1 = s1.replaceAll("[.]$", "");//如小数点后面全是零则去掉小数点
                    }
                    textViewDanR.setText(s1);
                    str = "";
                    textViewDanP.setText("");
                }

            }
        });

        buttonMian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 1;
                ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Mianji, android.R.layout.simple_spinner_item);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter3);

                ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Mianji, android.R.layout.simple_spinner_item);
                adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter4);

            }
        });

       buttonChang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 2;
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.ChangDu, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.ChangDu, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);

            }
        });

        buttonSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 3;
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Sudu, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Sudu, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);

            }
        });


        buttonShi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 4;
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.ShiJian, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.ShiJian, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);

            }
        });


        buttonZhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 5;
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Zhongliang, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);

                ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(DanweizhuanhuanActivity.this, R.array.Zhongliang, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i >= 0) {
                    locationR = i;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i >= 0) {
                    locationP = i;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        int id = item.getItemId();
        switch (id) {
            case R.id.Zhu4:
                intent.setClass(DanweizhuanhuanActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.Jin4:
                intent.setClass(DanweizhuanhuanActivity.this, jinzhiActivity.class);
                startActivity(intent);
                break;
            case R.id.San4:
                intent.setClass(DanweizhuanhuanActivity.this, sanjiaohanshuActivity.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);

    }


}
