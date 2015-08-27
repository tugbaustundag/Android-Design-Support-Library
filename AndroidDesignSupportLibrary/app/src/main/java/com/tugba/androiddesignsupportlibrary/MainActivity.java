package com.tugba.androiddesignsupportlibrary;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbar.setTitle("Into The Wild");


        CoordinatorLayout rootLayout = (CoordinatorLayout) findViewById(R.id.rootLayout);

        Snackbar.make(rootLayout, "Bu bir Snackbar...:)", Snackbar.LENGTH_LONG)
                .setAction("Action!", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.w("App", "Action!");
                    }
                } )
                .show();
    }

}
