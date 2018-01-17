package com.example.manolopina.myapplication;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AppEventsLogger logger = AppEventsLogger.newLogger(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logSentFriendRequestEvent () {
        logger.logEvent("sentFriendRequest");
    }
}
