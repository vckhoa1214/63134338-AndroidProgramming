package com.example.ex5_addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        edtKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        //Gắn bộ lắng nghe sk và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //xử lý trừ
                XULYCONG();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //xử lý trừ
                XULYTRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //xử lý nhân
                XULYNHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //xử lý chia
                XULYCHIA();
            }
        });
    }

    void XULYCONG(){
        //lấy dữ liệu
        String sa = edtA.getText().toString();
        String sb = edtB.getText().toString();
        //ép kiểu
        float numberA = Float.parseFloat(sa);
        float numberB = Float.parseFloat(sb);
        //xử lý
        float tong = numberA + numberB;
        String sKQ = String.valueOf(tong);
        edtKQ.setText(sKQ);
    }
    void XULYTRU(){
        //lấy dữ liệu
        String sa = edtA.getText().toString();
        String sb = edtB.getText().toString();
        //ép kiểu
        float numberA = Float.parseFloat(sa);
        float numberB = Float.parseFloat(sb);
        //xử lý
        float hieu = numberA - numberB;
        String sKQ = String.valueOf(hieu);
        edtKQ.setText(sKQ);

    }
    void XULYNHAN(){
        //lấy dữ liệu
        String sa = edtA.getText().toString();
        String sb = edtB.getText().toString();
        //ép kiểu
        float numberA = Float.parseFloat(sa);
        float numberB = Float.parseFloat(sb);
        //xử lý
        float tich = numberA * numberB;
        String sKQ = String.valueOf(tich);
        edtKQ.setText(sKQ);

    }
    void XULYCHIA(){
        //lấy dữ liệu
        String sa = edtA.getText().toString();
        String sb = edtB.getText().toString();
        //ép kiểu
        float numberA = Float.parseFloat(sa);
        float numberB = Float.parseFloat(sb);
        //xử lý
        float thuong = numberA / numberB;
        String sKQ = String.valueOf(thuong);
        edtKQ.setText(sKQ);

    }


}