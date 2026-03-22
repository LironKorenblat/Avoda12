package com.example.avoda12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
Switch sw;
ToggleButton tb;
int i = 0;
int j = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
    }

    public void switchClick(View view) {
        if(sw.isChecked()){
            j = 1;
        }
        else{
            j = 0;
        }
    }

    public void tbClick(View view) {
        if(tb.isChecked()){
            i = 1;
        }
        else{
            i = 0;
        }
    }

    public void click(View view) {
        if (i == 0 && j == 0) {

        }
        else if (i == 1 && j == 0) {
        }
        else if (i == 0 && j == 1) {
        }
        else {
        }
        i = 0;
        j = 0;
    }
}

