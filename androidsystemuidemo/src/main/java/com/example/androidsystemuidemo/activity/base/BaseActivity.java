package com.example.androidsystemuidemo.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by gqq on 4/27/16.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // turn off the title at the top of the screen.
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
