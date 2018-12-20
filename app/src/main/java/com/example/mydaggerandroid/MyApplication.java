package com.example.mydaggerandroid;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;

import com.example.mydaggerandroid.component.DaggerAppComponent;
import com.example.mydaggerandroid.module.AppModule;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasFragmentInjector;
//https://www.jianshu.com/p/30f7a79fa83e

public class MyApplication extends Application implements HasActivityInjector,HasFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().appModule(new AppModule()).build().inject(this);
//        DaggerAppComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return null;
    }
}
