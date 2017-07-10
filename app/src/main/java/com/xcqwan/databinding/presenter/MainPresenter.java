package com.xcqwan.databinding.presenter;


import com.xcqwan.databinding.databinding.ActivityMainBinding;
import com.xcqwan.databinding.mode.UserInfo;
import com.xcqwan.databinding.render.User;

/**
 * Created by Thanks on 2017/7/10.
 */

public class MainPresenter extends BasePresenter<ActivityMainBinding> {
    private UserInfo userInfo;

    public MainPresenter(ActivityMainBinding binding) {
        super(binding);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        User user = new User("name", 1);
        binding.setUser(user);

        userInfo =  new UserInfo("谢谢", "1980.01.08");
    }

    public void  update() {
        binding.getUser().name.set(userInfo.name);
        binding.getUser().age.set(userInfo.getAge());
    }
}
