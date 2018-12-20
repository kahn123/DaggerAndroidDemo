package com.example.mydaggerandroid.component;

import com.example.mydaggerandroid.MainActivity;
import com.example.mydaggerandroid.module.MainActivityModule;
import com.example.mydaggerandroid.scope.MyScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
@MyScope
@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }


}
