package com.example.mydaggerandroid.module;

import android.app.Activity;

import com.example.mydaggerandroid.MainActivity;
import com.example.mydaggerandroid.SecondActivity;
import com.example.mydaggerandroid.component.MainActivityComponent;
import com.example.mydaggerandroid.component.SecondActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class AllActivityModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivity();


//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjector(MainActivityComponent.Builder builder);
//
//
//    @Binds
//    @IntoMap
//    @ActivityKey(SecondActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjector2(SecondActivityComponent.Builder builder);



}
