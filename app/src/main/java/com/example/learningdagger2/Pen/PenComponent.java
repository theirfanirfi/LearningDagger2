package com.example.learningdagger2.Pen;

import com.example.learningdagger2.MainActivity;

import dagger.Component;

@Component
public interface PenComponent {
    void inject(MainActivity mainActivity);
}
