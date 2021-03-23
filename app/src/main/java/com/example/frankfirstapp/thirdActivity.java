package com.example.frankfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;

public class thirdActivity extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.third_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.third_button);
        final String text = " Activity 3 has read the message ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdActivity.this, fourthActivity.class);
                message = message +","+ text ;
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}