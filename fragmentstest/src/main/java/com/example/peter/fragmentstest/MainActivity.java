package com.example.peter.fragmentstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate start...");
        setContentView(R.layout.activity_main);
//        Display display = getWindowManager().getDefaultDisplay();

//        get screen width and height
        DisplayMetrics displaymetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int screenWidth = displaymetrics.widthPixels;
        int screenHeight = displaymetrics.heightPixels;
        Log.i("onCreate", String.format("width:%d, height:%d", screenWidth, screenHeight));
        if (screenWidth > screenHeight) {
            Fragment1 fragment1 = new Fragment1();
            getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment1).commit();
        } else {
            Fragment2 fragment2 = new Fragment2();
            getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment2).commit();
        }
        Log.d(TAG, "onCreate end...");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
