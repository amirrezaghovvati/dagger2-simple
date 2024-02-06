package com.example.dagger_till_module_binds_provide.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private Body body;
    private Engine engine;
    @Inject
    public Car(Body body,Engine engine){
        this.body=body;
        this.engine=engine;
    }
    public void turnOn(){
        Log.i("TAG",  "Car is turned on");
    }
}
