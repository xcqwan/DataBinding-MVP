package com.xcqwan.databinding.activity;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xcqwan.databinding.presenter.BasePresenter;

/**
 * Created by Thanks on 2017/7/10.
 */

public class BaseActivity<B extends ViewDataBinding, P extends BasePresenter<B>> extends AppCompatActivity {
    B binding;
    P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
