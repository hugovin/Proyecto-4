package com.dicovr.tabs;

import com.dicovr.tabs.Activities.DiscovrActivity;
import com.dicovr.tabs.Activities.EssentialsActivity;
import com.dicovr.tabs.Activities.ExploreActivity;
import com.dicovr.tabs.Activities.SearchActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Main extends TabActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Resources res = getResources(); // Resource object to get Drawables
		TabHost tabHost = getTabHost(); // The activity TabHost
		TabHost.TabSpec spec; // Resusable TabSpec for each tab
		Intent intent; // Reusable Intent for each tab

		// Create an Intent to launch an Activity for the tab (to be reused)
		intent = new Intent().setClass(this, DiscovrActivity.class);

		// Initialize a TabSpec for each tab and add it to the TabHost
		spec = tabHost.newTabSpec("Discovr").setIndicator("Discovr", res.getDrawable(R.drawable.ic_tab_discovr)).setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, ExploreActivity.class);
		spec = tabHost.newTabSpec("Explore").setIndicator("Explore", res.getDrawable(R.drawable.ic_tab_explore)).setContent(intent);
		tabHost.addTab(spec);

		intent = new Intent().setClass(this, SearchActivity.class);
		spec = tabHost.newTabSpec("Search").setIndicator("Search", res.getDrawable(R.drawable.ic_tab_search)).setContent(intent);
		tabHost.addTab(spec);

		// Do the same for the other tabs
		intent = new Intent().setClass(this, EssentialsActivity.class);
		spec = tabHost.newTabSpec("Essentials").setIndicator("Essentials", res.getDrawable(R.drawable.ic_tab_essentials)).setContent(intent);
		tabHost.addTab(spec);
		tabHost.setCurrentTab(1);

	}
}