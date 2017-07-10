package com.xcqwan.databinding.mode;

import java.util.Calendar;

/**
 * Created by Thanks on 2017/7/10.
 */

public class UserInfo {
    public String name;
    public String birthday;

    public UserInfo(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);
        int birthYear = 1980;
        try {
            birthYear = Integer.valueOf(birthday.substring(0, 4));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currYear - birthYear;
    }
}
