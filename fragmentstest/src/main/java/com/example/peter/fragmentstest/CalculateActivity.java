package com.example.peter.fragmentstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import peter.itu.util.AppUtils;
import peter.itu.util.DensityUtils;

public class CalculateActivity extends AppCompatActivity {

    TextView tvWH;
    TextView tvtvDpi;
    TextView tvWHdp;
    TextView tvRatio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        tvWH = (TextView) findViewById(R.id.tvWH);
        tvtvDpi = (TextView) findViewById(R.id.tvDpi);
        tvWHdp = (TextView) findViewById(R.id.tvWHdp);
        float[] wh = DensityUtils.getWH(this);
        tvWH.setText(String.format("%f * %f", wh[0], wh[1]));
//        tvtvDpi.setText();
        //dpi
        float dpi = DensityUtils.getDpi(this);
        tvtvDpi.setText(String.valueOf(dpi));

        //ratio
        float ratio = DensityUtils.getRatio(this);
        tvRatio = (TextView) findViewById(R.id.tvRatio);
        tvRatio.setText(String.valueOf(ratio));
        //wh with dp
        float wDp = wh[0] / ratio;
        float hDp = wh[1] / ratio;
        tvWHdp.setText(String.format("%f * %f", wDp, hDp));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculate, menu);
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
