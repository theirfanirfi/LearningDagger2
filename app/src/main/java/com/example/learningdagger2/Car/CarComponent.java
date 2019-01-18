package com.example.learningdagger2.Car;

import com.example.learningdagger2.MainActivity;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
