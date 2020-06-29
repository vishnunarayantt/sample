package com.example.sampleappcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "a24a85f2-c5ac-4774-b43b-55ee0ab5cc9f",
                Analytics.class, Crashes.class);
    }
}