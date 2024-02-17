package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Button btnGoToSecAct4 = (Button) findViewById(R.id.btnGoToSecAct4);

        View.OnClickListener oclBtnGoToSecAct4 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_4.this, Activity_5.class);
                startActivity(intent);

            }
        };

        btnGoToSecAct4.setOnClickListener(oclBtnGoToSecAct4);
    }
}