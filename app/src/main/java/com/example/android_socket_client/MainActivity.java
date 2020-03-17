package com.example.android_socket_client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText in_msg;
    Button send_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in_msg = findViewById(R.id.in_msg);
        send_btn = findViewById(R.id.send_btn);

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SendMessage().execute(in_msg.getText().toString());
                in_msg.getText().clear();
            }
        });


    }


}
