package edu.uw.tcss450.cam14673.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        Log.e("onStart", "in on start");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.i("onResume", "in on resume");
        super.onResume();
    }
    @Override
    protected void onPause(){
        Log.e("onPause", "in on pause");
        super.onPause();
    }
    @Override
    protected void onStop(){
        Log.v("onStop", "in on stop");
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        Log.w("onDestroy", "in on destroy");
        super.onDestroy();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
    }
}