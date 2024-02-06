package com.example.dagger_till_module_binds_provide.Car;

import com.example.dagger_till_module_binds_provide.MainActivity;

import dagger.Component;

@Component
public interface CarComponent {
    void injectFileds(MainActivity mainActivity);
}
