package com.example.peter.ubounded_service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.peter.fragmentstest.GQQService;
import com.example.peter.fragmentstest.R;

public class UboundedServiceActivity extends Activity {
    private static final String ACTIVITY = "ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubounded_service);
    }

    // Start the  service
    public void startNewService(View view) {
        Log.d(ACTIVITY, "startNewService");

        startService(new Intent(UboundedServiceActivity.this, GQQService.class));
    }

    // Stop the  service
    public void stopNewService(View view) {
        Log.d(ACTIVITY, "stopNewService");

        stopService(new Intent(UboundedServiceActivity.this, GQQService.class));
    }

    @Override
    protected void onDestroy() {
        Log.d(ACTIVITY, "onDestroy");
        super.onDestroy();
    }

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
}
