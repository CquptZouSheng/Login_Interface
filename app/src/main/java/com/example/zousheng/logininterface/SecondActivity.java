package com.example.zousheng.logininterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Zou Sheng on 2015/12/3.
 */
public class SecondActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);
        setContentView(R.layout.activity_second);
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(SecondActivity.this, "注册成功！", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
