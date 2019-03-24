package com.example.wufan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
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

public class jinzhiActivity extends AppCompatActivity {

    static String str = "";
    int locationR = 0;
    int locationP = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jinzhi);

        Button buttona = (Button) findViewById(R.id.buttona);
        Button buttonb = (Button) findViewById(R.id.buttonb);
        Button buttonc = (Button) findViewById(R.id.buttonc);
        Button buttond= (Button) findViewById(R.id.buttond);
        Button buttone = (Button) findViewById(R.id.buttone);
        Button buttonf = (Button) findViewById(R.id.buttonf);

        Button button1 = (Button) findViewById(R.id.buttonJin1);
        Button button2 = (Button) findViewById(R.id.buttonJin2);
        Button button3 = (Button) findViewById(R.id.buttonJin3);
        Button button4 = (Button) findViewById(R.id.buttonJin4);
        Button button5 = (Button) findViewById(R.id.buttonJin5);
        Button button6 = (Button) findViewById(R.id.buttonJin6);
        Button button7 = (Button) findViewById(R.id.buttonJin7);
        Button button8 = (Button) findViewById(R.id.buttonJin8);
        Button button9 = (Button) findViewById(R.id.buttonJin9);
        Button button0 = (Button) findViewById(R.id.buttonJin0);
        Button buttonHou = (Button) findViewById(R.id.buttonJinHou);
        Button buttonQing = (Button) findViewById(R.id.buttonJinQing);
        Button buttonzhuan = (Button) findViewById(R.id.buttonZhuan);
        final EditText textViewResult = (EditText) findViewById(R.id.Jinresult);
        final EditText textViewInput = (EditText) findViewById(R.id.Jinputin);
        textViewInput.setFocusable(false);
        textViewResult.setFocusable(false);
        textViewInput.setHorizontallyScrolling(true);
        textViewResult.setHorizontallyScrolling(true);

        final Spinner spinner = (Spinner) findViewById(R.id.spannerJR);
        final Spinner spinner1 = (Spinner)findViewById(R.id.spannerJP);
        str = textViewInput.getText().toString();


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.jinzhi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.jinzhi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

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

        buttonzhuan.setOnClickListener(new View.OnClickListener() {

            String num;
            int i;
            @Override


            public void onClick(View view) {
                try {
                    if (textViewInput.getText().toString().equals("")) {
                        return;
                    }
                    String s = textViewInput.getText().toString();
                    switch (locationP) {
                        case 2://er
                            num = Integer.valueOf(s, 2).toString();
                            break;
                        case 1://ba
                            num = Integer.valueOf(s, 8).toString();
                            break;
                        case 0://shi
                            num = s;
                            break;
                        case 3://shiliu
                            num = Integer.valueOf(s, 16).toString();
                            break;
                    }
                    i = Integer.valueOf(num);

                    switch (locationR) {
                        case 2://er
                            num = Integer.toBinaryString(i);
                            break;
                        case 1://ba
                            num = Integer.toOctalString(i);
                            break;
                        case 0://shi

                            break;
                        case 3://shiliu
                            num = Integer.toHexString(i);
                            break;
                    }
                    textViewResult.setText(num);
                    str = "";
                    textViewInput.setText("");
                }
                catch (Exception e)
                {
                    textViewResult.setText("输入错误");
                    str = "";
                    textViewInput.setText("");
                }

            }

        });

        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="a";
                textViewInput.setText(str);
            }
        });

        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="b";
                textViewInput.setText(str);
            }
        });

        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="c";
                textViewInput.setText(str);
            }
        });

        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="d";
                textViewInput.setText(str);
            }
        });

        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="e";
                textViewInput.setText(str);
            }
        });

        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str+="f";
                textViewInput.setText(str);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "1";
                textViewInput.setText(str);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "2";
                textViewInput.setText(str);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "3";
                textViewInput.setText(str);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "4";
                textViewInput.setText(str);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "5";
                textViewInput.setText(str);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "6";
                textViewInput.setText(str);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "7";
                textViewInput.setText(str);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str += "8";
                textViewInput.setText(str);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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





    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu3, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        int id = item.getItemId();
        switch (id) {
            case R.id.Zhu3:
                intent.setClass(jinzhiActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.San3:
                intent.setClass(jinzhiActivity.this, sanjiaohanshuActivity.class);
                startActivity(intent);
                break;
            case R.id.Dan3:
                intent.setClass(jinzhiActivity.this,DanweizhuanhuanActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);

    }
}
