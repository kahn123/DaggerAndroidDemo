package com.example.mydaggerandroid.module;

import com.example.mydaggerandroid.bean.Teacher;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    Teacher providesTeacher(){
        return new Teacher();
    }
}
