package com.example.mydaggerandroid;

import android.os.Bundle;

import com.example.mydaggerandroid.base.BaseActivity;
import com.example.mydaggerandroid.bean.ApiService;
import com.example.mydaggerandroid.bean.Teacher;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    @Inject
    ApiService apiService;

    @Inject
    Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(apiService);
        System.out.println(teacher);

    }
}
