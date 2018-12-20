package com.example.mydaggerandroid.module;

import com.example.mydaggerandroid.MainActivity;
import com.example.mydaggerandroid.SecondActivity;
import com.example.mydaggerandroid.component.BaseActivityComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = BaseActivityComponent.class)
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
