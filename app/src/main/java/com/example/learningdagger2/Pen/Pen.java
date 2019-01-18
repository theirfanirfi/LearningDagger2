package com.example.learningdagger2.Pen;

import android.util.Log;

import javax.inject.Inject;

public class Pen {

    private Ink ink;
    private Plastic plastic;
    private static final String TAG = "Pen";
    @Inject
    public Pen(Ink ink, Plastic plastic) {
        this.ink = ink;
        this.plastic = plastic;
    }

    public void write(){
        Log.i(TAG, "write: something...");
    }

}
