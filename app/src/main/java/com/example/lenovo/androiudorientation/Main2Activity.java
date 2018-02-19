package com.example.lenovo.androiudorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv_Information;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=getIntent().getStringExtra("value");
        tv_Information=(TextView) findViewById(R.id.tv_Information);
        tv_Information.setText("Your Stored Data,  "+  name);

    }
}
