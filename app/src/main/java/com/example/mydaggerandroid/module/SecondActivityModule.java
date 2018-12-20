package com.example.mydaggerandroid.module;

import com.example.mydaggerandroid.bean.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

@Provides
    Student providesStudent(){
    return  new Student();
}

}
