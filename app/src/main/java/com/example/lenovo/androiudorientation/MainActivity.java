package com.example.lenovo.androiudorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_Activity;
    Button btn_Information;
    TextView tv_Message;
    int NumberOfClicks = 0;
    private static final String DATA= "_data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Activity = (Button) findViewById(R.id.btn_Activity);
        btn_Information=(Button) findViewById(R.id.btn_Information);
        tv_Message = (TextView) findViewById(R.id.tv_Message);

        if (savedInstanceState!=null) {
            NumberOfClicks =savedInstanceState.getInt(DATA);
            tv_Message.setText("Nuumber of times Button clicked" + String.valueOf(NumberOfClicks)+"times");
        }
        else{
            Toast.makeText(this, "Button is not clicked", Toast.LENGTH_SHORT).show();
        }


        btn_Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberOfClicks++;
                tv_Message.setText("Nuumber of times Button clicked:" + String.valueOf(NumberOfClicks)+"times");
            }
        });
        btn_Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=tv_Message.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,com.example.lenovo.androiudorientation.Main2Activity.class);
                intent.putExtra("value",name);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(DATA,NumberOfClicks);
    }




}
