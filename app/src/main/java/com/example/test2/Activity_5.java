package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Button btnGoToMainAct = (Button) findViewById(R.id.btnGoToMainAct);

        View.OnClickListener oclBtnGoToMainAct = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Activity_5.this, MainActivity.class);
                startActivity(intent);

            }
        };

        btnGoToMainAct.setOnClickListener(oclBtnGoToMainAct);
    }
}