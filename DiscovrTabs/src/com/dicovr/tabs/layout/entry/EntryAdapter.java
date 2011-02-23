package com.dicovr.tabs.layout.entry;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.dicovr.tabs.R;

public class EntryAdapter extends ArrayAdapter<Entry> {
	private LayoutInflater inflater;

	public EntryAdapter(List<Entry> list, Context context) {
		super(context, R.layout.entry, list);
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View entry = convertView;
		EntryViewWrapper wrapper = new EntryViewWrapper(convertView);

		if (entry == null) {
			entry = inflater.inflate(R.layout.entry, parent, false);
			wrapper = new EntryViewWrapper(entry);
			entry.setTag(wrapper);
		} else {
			wrapper = (EntryViewWrapper) entry.getTag();
		}
		Entry entryData = this.getItem(position);
		wrapper.getIcon().setImageResource(R.drawable.ic_default);
		wrapper.getName().setText(entryData.getName());
		wrapper.getCategory().setText(entryData.getCategory());
		wrapper.getArrow().setImageResource(R.drawable.arrow_orange_right);
		return entry;
	}
}
