package com.example.ali.a00267lab1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    protected static final String ACTIVITY_NAME = "StartActivity";
Log.i(ACTIVITY_NAME,"In onCreate()")
            Log.i(ACTIVITY_NAME,"In onResume()")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    protected void onStart() {
        super.onStart();

        protected static final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Log.i(ACTIVITY_NAME, "In onResume()");


    }

    protected void onResume() {
        super.onResume();

        protected static final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Log.i(ACTIVITY_NAME, "In onResume()");


    }

    protected void onPause() {
        super.onPause();

        protected static final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Log.i(ACTIVITY_NAME, "In onResume()");


    }

    protected void onStop() {
        super.onStop();

        protected static final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Log.i(ACTIVITY_NAME, "In onResume()");


    }

    protected void onDestroy() {
        super.onDestroy();

        protected static final String ACTIVITY_NAME = "StartActivity";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        Log.i(ACTIVITY_NAME, "In onResume()");


    }



}
