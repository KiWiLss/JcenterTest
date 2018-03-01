package com.magicsoft.mylibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * <pre>
 *     @author : Lss winding
 * </pre>
 */


public class BaseActivity extends AppCompatActivity {

    public static final String TAG = "MMM";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: baseactivity");
    }
}
