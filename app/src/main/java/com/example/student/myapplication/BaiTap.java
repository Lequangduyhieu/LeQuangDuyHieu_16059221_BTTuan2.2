package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BaiTap extends AppCompatActivity {
    EditText edtFah, edtCel;
    Button btnF, btnC, btnCle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap);
        AnhXa();
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Fah = edtFah.getText().toString();
                //String Cel = edtCel.getText().toString();
                int doiF = Integer.parseInt(Fah);
                int sangC = ((doiF)-32)*(5/9);
                edtCel.setText(String.valueOf(sangC));
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Cel = edtCel.getText().toString();
                int doiC = Integer.parseInt(Cel);
                int sangF = (doiC)*(9/5)+32;
                edtFah.setText(String.valueOf(sangF));
            }
        });
        btnCle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtFah.setText("");
                edtCel.setText("");
            }
        });
    }


    private void AnhXa() {
        edtFah = (EditText) findViewById(R.id.edtFah);
        edtCel = (EditText) findViewById(R.id.edtCel);
        btnF = (Button) findViewById(R.id.btnF);
        btnC = (Button) findViewById(R.id.btnC);
        btnCle = (Button) findViewById(R.id.btnCle);
    }

}
