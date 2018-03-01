package com.magicsoft.mylibrary;

import android.util.Log;

import static com.magicsoft.mylibrary.BaseActivity.TAG;

/**
 * <pre>
 *     @author : Lss windin
 * </pre>
 */


public class Utils {

    public static void foreach(){
        for (int i = 0; i < 10; i++) {
            Log.e(TAG, "foreach: "+i);
        }
    }
}
