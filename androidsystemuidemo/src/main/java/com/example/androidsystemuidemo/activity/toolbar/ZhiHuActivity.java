package com.example.androidsystemuidemo.activity.toolbar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.androidsystemuidemo.R;
import com.example.androidsystemuidemo.activity.base.BaseActivity;

public class ZhiHuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_hu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.zhihu_toolbar_menu);

        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);

        toolbar.setTitle(R.string.home_page);
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
    }
}
