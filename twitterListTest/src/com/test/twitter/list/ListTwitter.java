package com.test.twitter.list;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import android.app.ListActivity;
import android.os.Bundle;

public class ListTwitter extends ListActivity {
	ConfigurationBuilder cb = new ConfigurationBuilder();
	TwitterFactory tf;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		createConfiguration();
		tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		ResponseList<Status> statuses;

		try {
			statuses = twitter.getFriendsTimeline();
			setListAdapter(new TwitterEntryAdapter(statuses, this));
			
		} catch (TwitterException e) {
			e.printStackTrace();
		}

	}

	private void createConfiguration() {
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey("VD1LBNkdeFcoy7VtboUXA");
		cb.setOAuthConsumerSecret("ft15DtddGIwrgROOrm3aTahke2bUMbXWa48vOAmzc");
		cb.setOAuthAccessToken("100728081-fLjqTuPIF0rt4kAdNRIMGVwpi3PftMY6gxlureOy");
		cb.setOAuthAccessTokenSecret("r2rKyBkxbCz2Kgym5aHUmrM3Ecj5UYGfKRCcvaRLxAI");
	}
}