package com.example.frankfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fifthActivity extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.fifth_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.fifth_button);
        final String text = " Activity 5 read the message ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fifthActivity.this, MainActivity.class);
                message = message+","+ text ;
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}