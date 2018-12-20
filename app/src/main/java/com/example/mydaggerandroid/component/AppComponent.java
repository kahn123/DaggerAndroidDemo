package com.example.mydaggerandroid.component;

import com.example.mydaggerandroid.MyApplication;
import com.example.mydaggerandroid.module.AllActivityModule;
import com.example.mydaggerandroid.module.AppModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AppModule.class, AllActivityModule.class, AndroidInjectionModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent {

    void inject(MyApplication myApplication);

}

