package com.dicovr.tabs.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DiscovrActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView textview = new TextView(this);
		textview.setText("This is the Discovr tab");
		setContentView(textview);
	}
}