package com.xcqwan.databinding.presenter;


import android.databinding.ViewDataBinding;
import android.util.Log;

/**
 * Created by Thanks on 2017/7/10.
 */

public abstract class BasePresenter<T extends  ViewDataBinding> {
    private final String TAG = getClass().getSimpleName();
    T binding;

    BasePresenter(T binding) {
        Log.d(TAG, "constructor");
        this.binding = binding;
    }

    public void onCreate() {
        Log.d(TAG, "onCreate");
    }

    public void onResume() {
        Log.d(TAG, "onResume");
    }

    public void onPause() {
        Log.d(TAG, "onPause");
    }

    public void onDestroy() {
        Log.d(TAG, "onDestroy");
    }
}
