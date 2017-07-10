package com.xcqwan.databinding.render;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Thanks on 2017/7/7.
 */

public class User extends BaseObservable{
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

    public User(String name, int age) {
        this.name.set(name);
        this.age.set(age);
    }
}
