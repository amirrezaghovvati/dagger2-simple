package com.example.dagger_till_module_binds_provide.Mobile;

import android.util.Log;

import javax.inject.Inject;

public class Camera implements Board{
    @Inject
    public Camera(){}
    @Override
    public void runCamera() {
        Log.i("TAG", "Camer is running");
    }
}
