package com.example.androidservicelearning;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class UboundedServiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    // Start the  service
    public void startNewService(View view) {
        Log.d(this.getClass().getSimpleName(), "startNewService");
        startService(new Intent(this, GQQService.class));
    }

    // Stop the  service
    public void stopNewService(View view) {
        Log.d(this.getClass().getSimpleName(), "stopNewService");
        stopService(new Intent(this, GQQService.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
