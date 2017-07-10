package com.xcqwan.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.xcqwan.databinding.databinding.ActivityMainBinding;
import com.xcqwan.databinding.model.User;

public class MainActivity extends AppCompatActivity {
    private User user;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("谢谢", 10);
        binding.setUser(user);

        binding.update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                user.setName(user.getName() + count);
                user.setAge(user.getAge() + 1);
            }
        });
    }
}
