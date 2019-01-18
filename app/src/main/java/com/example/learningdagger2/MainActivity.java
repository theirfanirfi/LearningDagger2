package com.example.learningdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.learningdagger2.Car.Car;
import com.example.learningdagger2.Car.CarComponent;
import com.example.learningdagger2.Car.DaggerCarComponent;
import com.example.learningdagger2.Pen.DaggerPenComponent;
import com.example.learningdagger2.Pen.Pen;
import com.example.learningdagger2.Pen.PenComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;
    @Inject
    Pen pen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       CarComponent carComponent = DaggerCarComponent.create();
//       carComponent.inject(this);
////        car = carComponent.getCar();
//        car.drive();

        PenComponent component = DaggerPenComponent.create();
        component.inject(this);
        pen.write();
    }
}
