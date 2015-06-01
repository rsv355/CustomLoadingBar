package com.krishna.customloadingbar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.customloaders.LoaderType;


public class MainActivity extends ActionBarActivity {
    com.android.customloaders.LoaderView Loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loader = (com.android.customloaders.LoaderView)findViewById(R.id.imageLoader);

        Loader.setLoader(LoaderType.MAP_MARKER);
    }



}
