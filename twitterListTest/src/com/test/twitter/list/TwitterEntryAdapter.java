package com.test.twitter.list;

import twitter4j.ResponseList;
import twitter4j.Status;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TwitterEntryAdapter extends ArrayAdapter<Status> {
	private LayoutInflater inflater;

	TwitterEntryAdapter(ResponseList<Status> list, Context context) {
		super(context, R.layout.twitter_entry, list);
		this.inflater = LayoutInflater.from(context);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View entry = convertView;
		TwitterEntryViewWrapper wrapper = new TwitterEntryViewWrapper(convertView);

		if (entry == null) {
			entry = inflater.inflate(R.layout.twitter_entry, parent, false);
			wrapper = new TwitterEntryViewWrapper(entry);
			entry.setTag(wrapper);
		} else {
			wrapper = (TwitterEntryViewWrapper) entry.getTag();
		}
		Status status = this.getItem(position);
		wrapper.getAvatar().setImageResource(R.drawable.pabskun);
		wrapper.getUsername().setText(status.getUser().getName());
		wrapper.getBody().setText(status.getText());
		wrapper.getDate().setText("Hace un ratillo");
		return entry;
	}
}
