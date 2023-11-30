package com.example.buoi3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnChandoan;
    EditText editTen,editChieucao,editCannang,editBMI,editChandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChandoan = findViewById(R.id.button3);
        editTen = findViewById(R.id.editTextText);
        editChieucao = findViewById(R.id.editTextText2);
        editCannang = findViewById(R.id.editTextText3);
        editBMI = findViewById(R.id.editTextText5);
        editChandoan = findViewById(R.id.editTextText4);
        btnChandoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double H = Double.parseDouble(editChieucao.getText() + "");
                double W = Double.parseDouble(editCannang.getText() + "");
                double BMI = W / Math.pow(H, 2);
                String chuandoan = "";
                if (BMI < 18) {
                    chuandoan = "Bạn gầy";
                } else if (BMI <= 24.9) {
                    chuandoan = "Bạn bình thường";
                } else if (BMI <= 29.9) {
                    chuandoan = "Bạn béo phì độ 1";
                } else if (BMI <= 34.9) {
                    chuandoan = "Bạn béo phì độ 2";
                } else {
                    chuandoan = "Bạn béo phì độ 3";
                }
                DecimalFormat dcf = new DecimalFormat("#.0");
                editBMI.setText(dcf.format(BMI));
                editChandoan.setText(chuandoan);
            }
        });
    }
}