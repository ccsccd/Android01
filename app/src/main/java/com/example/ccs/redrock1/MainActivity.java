package com.example.ccs.redrock1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Button button_main = (Button)findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“手机号登录”",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,LoginPageActivity.class);
                startActivity(intent);
            }
        });
        Button button_main2 = (Button)findViewById(R.id.button_main2);
        button_main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“注册”",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,RegistrationPageActivity.class);
                startActivity(intent);
            }
        });
        Button button_main3 = (Button)findViewById(R.id.button_main3);
        button_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“微信登录”",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_main4 = (Button)findViewById(R.id.button_main4);
        button_main4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“QQ登录”",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_main5 = (Button)findViewById(R.id.button_main5);
        button_main5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“微博登录”",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_main6 = (Button)findViewById(R.id.button_main6);
        button_main6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你点击了“网易邮箱登录”",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
