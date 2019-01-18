package com.example.learningdagger2.Business;

import com.example.learningdagger2.MainActivity;

import dagger.Component;

@Component
public interface BusinessComponent {

    void inject(MainActivity mainActivity);
}
