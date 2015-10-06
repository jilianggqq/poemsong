package com.example.screeninfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import peter.itu.util.DensityUtils;
import peter.itu.util.ScreenUtils;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "CalculateActivity";
    TextView tvWH;
    TextView tvRealWH;
    TextView tvDpi;
    TextView tvWHdp;
    TextView tvRatio;
    TextView tvStatusBar;
    TextView tvRealWHdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWH = (TextView) findViewById(R.id.tvWH);
        tvRealWH = (TextView) findViewById(R.id.tvRealWH);
        tvRealWHdp = (TextView) findViewById(R.id.tvRealWHdp);
        tvDpi = (TextView) findViewById(R.id.tvDpi);
        tvWHdp = (TextView) findViewById(R.id.tvWHdp);
        tvStatusBar = (TextView) findViewById(R.id.tvStatusBar);
        float[] wh = ScreenUtils.getWH(this);
        //1. screen dimension with px
        tvWH.setText(String.format("%fpx * %fpx", wh[0], wh[1]));
//        tvDpi.setText();
        //2. dpi
        float dpi = DensityUtils.getDpi(this);
        tvDpi.setText(String.valueOf(dpi));

        //3. ratio = dpi/160
        float ratio = DensityUtils.getRatio(this);
        tvRatio = (TextView) findViewById(R.id.tvRatio);
        tvRatio.setText(String.valueOf(ratio));
        //4. screen dimension with dp
        float wDp = wh[0] / ratio;
        float hDp = wh[1] / ratio;
        tvWHdp.setText(String.format("%f * %f", wDp, hDp));
//      4.show the height of the status bar.
        tvStatusBar.setText(String.valueOf(ScreenUtils.getStatusHeight(this)));
        float[] realWh = ScreenUtils.getRealWH(this);
//        5.real dimension with px
        tvRealWH.setText(String.format("%f * %f", realWh[0], realWh[1]));
//        6.real dimension with dp
        tvRealWHdp.setText(String.format("%f * %f", realWh[0] / ratio, realWh[1] / ratio));
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
