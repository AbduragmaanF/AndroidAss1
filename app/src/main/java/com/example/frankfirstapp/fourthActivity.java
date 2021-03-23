package com.example.frankfirstapp;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class fourthActivity extends AppCompatActivity {

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        message = getIntent().getStringExtra("KEY");
        TextView textView = findViewById(R.id.fourth_textView);
        textView.setText(message);

        final Button button = findViewById(R.id.fourth_button);
        final String text = " Activity 4 has read the message ";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthActivity.this, fifthActivity.class);
                message = message +","+ text ;
                intent.putExtra("KEY" ,message);
                startActivity(intent);
            }
        });
    }
}