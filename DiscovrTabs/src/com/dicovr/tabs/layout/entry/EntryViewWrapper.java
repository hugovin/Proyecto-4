package com.dicovr.tabs.layout.entry;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dicovr.tabs.R;

public class EntryViewWrapper {
	private View base;
	private ImageView icon;
	private TextView name;
	private TextView category;
	private ImageView arrow;

	EntryViewWrapper(View base) {
		this.base = base;
	}

	public ImageView getIcon() {
		if (this.icon == null) {
			this.icon = (ImageView) base.findViewById(R.id.iconImageView);
		}
		return icon;
	}

	public TextView getName() {
		if (this.name == null) {
			this.name = (TextView) base.findViewById(R.id.nameTextView);
		}
		return name;
	}

	public TextView getCategory() {
		if (this.category == null) {
			this.category = (TextView) base.findViewById(R.id.categoryTextView);
		}
		return category;
	}

	public ImageView getArrow() {
		if (this.arrow == null) {
			this.arrow = (ImageView) base.findViewById(R.id.arrowImageView);
		}
		return icon;
	}

}
