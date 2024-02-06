package com.example.dagger_till_module_binds_provide;

import android.util.Log;

import javax.inject.Inject;

public class Glide implements ImageService{
    @Inject
    public Glide(){}
    @Override
    public void getImage(String url) {
        Log.i("TAG", "Glide is running: ");
    }
}
