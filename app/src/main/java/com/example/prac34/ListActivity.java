package com.example.prac34;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;

import java.util.List;




public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == imageView) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Profile")
                    .setMessage("MADness")
                    .setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    })
                    .setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // Do something when "View" button is clicked
                        }
                    });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();

        }
    }


}