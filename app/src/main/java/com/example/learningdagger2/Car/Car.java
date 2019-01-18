package com.example.learningdagger2.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private Wheel wheel;
    private Engine engine;

    private static final String TAG = "Car";

    @Inject
    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive(){
        Log.d(TAG, "driving ......");
    }
}
