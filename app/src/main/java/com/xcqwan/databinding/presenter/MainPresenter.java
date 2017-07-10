package com.xcqwan.databinding.presenter;

import android.view.View;

import com.xcqwan.databinding.databinding.ActivityMainBinding;
import com.xcqwan.databinding.render.User;

/**
 * Created by Thanks on 2017/7/10.
 */

public class MainPresenter extends BasePresenter<ActivityMainBinding> implements View.OnClickListener {

    public MainPresenter(ActivityMainBinding binding) {
        super(binding);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        User user = new User("name", 1);
        binding.setUser(user);
        binding.update.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        binding.getUser().name.set(binding.getUser().name.get() + "~");
        binding.getUser().age.set(binding.getUser().age.get() + 1);
    }
}
