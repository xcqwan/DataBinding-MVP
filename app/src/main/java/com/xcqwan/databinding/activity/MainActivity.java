package com.xcqwan.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.xcqwan.databinding.R;
import com.xcqwan.databinding.databinding.ActivityMainBinding;
import com.xcqwan.databinding.presenter.MainPresenter;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainPresenter> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.update.setOnClickListener(this);

        presenter = new MainPresenter(binding);
        presenter.onCreate();
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

    @Override
    public void onClick(View v) {
        presenter.update();
    }
}
