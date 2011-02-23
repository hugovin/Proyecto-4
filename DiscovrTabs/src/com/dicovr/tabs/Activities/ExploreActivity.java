package com.dicovr.tabs.Activities;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;

import com.dicovr.tabs.R;
import com.dicovr.tabs.layout.entry.Entry;
import com.dicovr.tabs.layout.entry.EntryAdapter;

public class ExploreActivity extends ListActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_explore);
		
		List<Entry> entryData = new ArrayList<Entry>();
		entryData.add(new Entry("Nombre1","Categoria1"));
		entryData.add(new Entry("Nombre2","Categoria3"));
		setListAdapter(new EntryAdapter(entryData, this));
	}
}