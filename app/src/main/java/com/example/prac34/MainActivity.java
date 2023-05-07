package com.example.prac34;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prac34.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (btn.getText().equals("FOLLOW")){
            btn.setText("UNFOLLOW");
            Context context = MainActivity.this;
            String text = "Followed";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(text);
        }
        else if (btn.getText().equals("UNFOLLOW")){
            btn.setText("FOLLOW");
        }






    }












}