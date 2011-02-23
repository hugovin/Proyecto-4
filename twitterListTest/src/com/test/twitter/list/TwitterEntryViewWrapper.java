package com.test.twitter.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TwitterEntryViewWrapper {
	private View base;
	private ImageView avatar;
	private TextView username;
	private TextView body;
	private TextView date;

	TwitterEntryViewWrapper(View base) {
		this.base = base;
	}

	public ImageView getAvatar() {
		if (this.avatar == null) {
			this.avatar = (ImageView) base.findViewById(R.id.avatarImageView);
		}
		return avatar;
	}

	public TextView getUsername() {
		if (this.username == null) {
			this.username = (TextView) base.findViewById(R.id.usernameTextView);
		}
		return username;
	}

	public TextView getBody() {
		if (this.body == null) {
			this.body = (TextView) base.findViewById(R.id.bodyTextView);
		}
		return body;
	}

	public TextView getDate() {
		if (this.date == null) {
			this.date = (TextView) base.findViewById(R.id.dateTextView);
		}
		return date;
	}

}
