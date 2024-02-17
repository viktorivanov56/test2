package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button btnGoToSecAct3 = (Button) findViewById(R.id.btnGoToSecAct3);

        View.OnClickListener oclBtnGoToSecAct3 = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_3.this, Activity_4.class);
                startActivity(intent);

            }
        };

        btnGoToSecAct3.setOnClickListener(oclBtnGoToSecAct3);
    }
}