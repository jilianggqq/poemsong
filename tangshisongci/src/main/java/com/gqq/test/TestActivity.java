package com.gqq.test;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.common.base.Joiner;
import com.gqq.tangpoem.R;

import peter.itu.util.AppUtils;
import peter.itu.util.DensityUtils;
import peter.itu.util.L;
import peter.itu.util.ScreenUtils;
import peter.itu.util.T;

public class TestActivity extends Activity {

    private Button btnTestToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        System.out.println("oncreate");
        // Test some common methods
        // test toast
        btnTestToast = (Button) findViewById(R.id.btnTestToast);
        if (btnTestToast != null) {
            btnTestToast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    T.showLong(TestActivity.this, "test ok");
                    //Test AppUitils
                    L.d("app name", AppUtils.getAppName(TestActivity.this));
                    L.d("version name", AppUtils.getVersionName(TestActivity.this));
                    //Test dp to px, and px to dp
                    int dp = 30;
                    L.d("dp to px", String.valueOf(DensityUtils.dp2px(getBaseContext(), dp)));
                    int px = 60;
                    L.d("px to dp", String.valueOf(DensityUtils.px2dp(getBaseContext(), px)));
                    //Test ScreenInfo
                    Context baseContext = getBaseContext();
                    int screenHeight = ScreenUtils.getScreenHeight(baseContext);
                    int screenWidth = ScreenUtils.getScreenWidth(baseContext);
                    int statusHeight = ScreenUtils.getStatusHeight(baseContext);

                    //test guava
                    Joiner joiner = Joiner.on(" ").skipNulls();
                    L.d("screenHeight screenWidth statusHeight ", joiner.join(screenHeight, screenWidth, statusHeight));
                }
            });
        } else {
            L.d("button not found");
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
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
