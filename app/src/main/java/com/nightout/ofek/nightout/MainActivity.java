package com.nightout.ofek.nightout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button addData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData=(Button) findViewById(R.id.add_Data);
    }
    public void onClick(View view){
        Intent intent=new Intent(this,AddData.class);
        startActivity(intent);
    }

}