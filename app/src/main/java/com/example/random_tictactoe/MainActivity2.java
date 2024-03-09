package com.example.random_tictactoe;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,breset;
    TextView txtwin;
    int temp=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        txtwin = findViewById(R.id.txtwin);
        breset = findViewById(R.id.btnreset);
        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                txtwin.setText("");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b1.setText("X");
                    b1.setEnabled(false);
                    get();
                }
                else
                {
                    b1.setText("0");
                    b1.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b2.setText("X");
                    b2.setEnabled(false);
                    get();
                }
                else
                {
                    b2.setText("0");
                    b2.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b3.setText("X");
                    b3.setEnabled(false);
                    get();
                }
                else
                {
                    b3.setText("0");
                    b3.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b4.setText("X");
                    b4.setEnabled(false);
                    get();
                }
                else
                {
                    b4.setText("0");
                    b4.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b5.setText("X");
                    b5.setEnabled(false);
                    get();
                }
                else
                {
                    b5.setText("0");
                    b5.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b6.setText("X");
                    b6.setEnabled(false);
                    get();
                }
                else
                {
                    b6.setText("0");
                    b6.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b7.setText("X");
                    b7.setEnabled(false);
                    get();
                }
                else
                {
                    b7.setText("0");
                    b7.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b8.setText("X");
                    b8.setEnabled(false);
                    get();
                }
                else
                {
                    b8.setText("0");
                    b8.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (temp%2==0)
                {
                    b9.setText("X");
                    b9.setEnabled(false);
                    get();
                }
                else
                {
                    b9.setText("0");
                    b9.setEnabled(false);
                    get();
                }
                temp++;
            }
        });
    }
        void dis ()
        {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b8.setText("");
            b9.setText("");
        }

        void get () {
            if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            }else if (b2.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            }else if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) {
                txtwin.setText("X Are Win");
                dis();
            } else if (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) {
                txtwin.setText("O Are Win");
                dis();
            } else if (b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != "" && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
                txtwin.setText("Try it Now");
            }
        }
}