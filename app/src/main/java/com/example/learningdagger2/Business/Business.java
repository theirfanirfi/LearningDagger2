package com.example.learningdagger2.Business;

import android.util.Log;

import javax.inject.Inject;

public class Business {

    @Inject Employees employees;
    @Inject Admin admin;
    private static final String TAG = "Business";
    @Inject
    public Business(Employees employees, Admin admin) {
        this.employees = employees;
        this.admin = admin;
    }

    public void work(){
        Log.i(TAG, "work: ");
    }
}
