package com.example.random_tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn[] = new Button[9];
    Button btnreset;
    TextView txtwin;
    int cnt = 0;
    ArrayList list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnreset = findViewById(R.id.btnreset);
        txtwin = findViewById(R.id.txtwin);

        for (int i = 0; i < btn.length; i++) {

            int id = getResources().getIdentifier("btn" + i, "id", getPackageName());
            btn[i] = findViewById(id);
            btn[i].setOnClickListener(this);
            System.out.println("id=" + id);

        }
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnreset();
            }
        });

    }

    private void btnreset() {
        for (int i = 0; i < btn.length; i++) {
            btn[i].setEnabled(true);
            list.clear();
            btn[i].setText("");
            cnt = 0;
            txtwin.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        for (int i = 0; i < btn.length; i++) {
            if (view.getId() == btn[i].getId()) {
                btn[i].setText("X");
                btn[i].setEnabled(false);
                list.add(i);
                cnt++;
                win();
                System.out.println("User tick=" + i);
                if (cnt <= 4) {
                    while (true) {
                        int min = 0, max = 9;
                        int r = new Random().nextInt(max - min) + min;
                        System.out.println("Random=" + r);
                        if (!list.contains(r)) {
                            btn[r].setText("O");
                            btn[r].setEnabled(false);
                            list.add(r);
                            win();
                            System.out.println("System Tick=" + r);
                            break;
                        }
                    }
                }

            }
        }

        System.out.println("List" + list);
    }

    private void dis() {

        for (int i = 0; i < btn.length; i++) {
            btn[i].setEnabled(false);
        }
    }

    private void win() {
        if (btn[0].getText().equals("X") && btn[1].getText().equals("X") && btn[2].getText().equals("X")) {
            txtwin.setText("X is win");
            dis();
        } else if (btn[0].getText().equals("O") && btn[1].getText().equals("O") && btn[2].getText().equals("O")) {
            txtwin.setText("O is win");
            dis();
        } else if (btn[0].getText().equals("X") && btn[3].getText().equals("X") && btn[6].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[0].getText().equals("O") && btn[3].getText().equals("O") && btn[6].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[0].getText().equals("X") && btn[4].getText().equals("X") && btn[8].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[0].getText().equals("O") && btn[4].getText().equals("O") && btn[8].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[1].getText().equals("X") && btn[4].getText().equals("X") && btn[7].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[1].getText().equals("O") && btn[4].getText().equals("O") && btn[7].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[2].getText().equals("X") && btn[4].getText().equals("X") && btn[6].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[2].getText().equals("O") && btn[4].getText().equals("O") && btn[6].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[2].getText().equals("X") && btn[5].getText().equals("X") && btn[8].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[2].getText().equals("O") && btn[5].getText().equals("O") && btn[8].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[3].getText().equals("X") && btn[4].getText().equals("X") && btn[5].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[3].getText().equals("O") && btn[4].getText().equals("O") && btn[5].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[6].getText().equals("X") && btn[7].getText().equals("X") && btn[8].getText().equals("X")) {
            txtwin.setText("X are win");
            dis();
        } else if (btn[6].getText().equals("O") && btn[7].getText().equals("O") && btn[8].getText().equals("O")) {
            txtwin.setText("O are win");
            dis();
        } else if (btn[0].getText() != "" && btn[1].getText() != "" && btn[2].getText() != "" && btn[3].getText() != "" && btn[4].getText() != "" && btn[5].getText() != "" && btn[6].getText() != "" && btn[7].getText() != "" && btn[8].getText() != "") {
            txtwin.setText("try Again");
        }

    }

}