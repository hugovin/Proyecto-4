package com.dicovr.tabs.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EssentialsActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Essentials tab");
        setContentView(textview);
    }
}