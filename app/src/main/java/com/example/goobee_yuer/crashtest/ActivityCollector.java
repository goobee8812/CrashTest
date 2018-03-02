package com.example.goobee_yuer.crashtest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Goobee_yuer on 2018/3/2.
 * 一个activity的专门集合类
 */

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity : activities){
            activity.finish();
        }
    }
}
