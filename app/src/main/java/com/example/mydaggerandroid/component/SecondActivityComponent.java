package com.example.mydaggerandroid.component;

import com.example.mydaggerandroid.SecondActivity;
import com.example.mydaggerandroid.module.SecondActivityModule;
import com.example.mydaggerandroid.scope.MyScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
@MyScope
@Subcomponent(modules = SecondActivityModule.class)
public interface SecondActivityComponent extends AndroidInjector<SecondActivity> {


    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity>{

    }


}
