package com.xcqwan.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.xcqwan.databinding.BR;

/**
 * Created by Thanks on 2017/7/7.
 */

public class User extends BaseObservable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
