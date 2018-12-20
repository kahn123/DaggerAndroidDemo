package com.example.mydaggerandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mydaggerandroid.base.BaseActivity;
import com.example.mydaggerandroid.bean.ApiService;
import com.example.mydaggerandroid.bean.Student;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity {
    @Inject
    ApiService apiService;

    @Inject
    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
