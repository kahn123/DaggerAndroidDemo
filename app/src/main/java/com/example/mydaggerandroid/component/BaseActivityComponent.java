package com.example.mydaggerandroid.component;

import com.example.mydaggerandroid.base.BaseActivity;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseActivityComponent extends AndroidInjector<BaseActivity> {


    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity>{

    }
}
