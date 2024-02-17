package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btnGoToSecAct2 = (Button) findViewById(R.id.btnGoToSecAct2);

        View.OnClickListener oclBtnGoToSecAct2 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_2.this, Activity_3.class);
                startActivity(intent);

            }
        };

        btnGoToSecAct2.setOnClickListener(oclBtnGoToSecAct2);
    }
}