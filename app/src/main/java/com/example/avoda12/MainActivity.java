package com.example.avoda12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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

LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sw = findViewById(R.id.sw);
        tb = findViewById(R.id.tb);
        ll = findViewById(R.id.ll);

    }

    /**
     * Changes the background according to the states (on or off) of the toggle and switch.
     * There are 4 backgrounds possible.
     * <p>
     *
     * @param view The button being clicked.
     *
     */

    public void click(View view) {
        Boolean i = tb.isChecked();
        Boolean j = sw.isChecked();

        if (i && j) {
            ll.setBackgroundColor(android.graphics.Color.parseColor("#FC0000"));
        }
        else if (i  && !j) {
            ll.setBackgroundColor(android.graphics.Color.parseColor("#00FC00"));
        }
        else if (!i && j) {
            ll.setBackgroundColor(android.graphics.Color.parseColor("#0000FC"));
        }
        else {
            ll.setBackgroundColor(android.graphics.Color.parseColor("#9600FF"));
        }

    }
}

