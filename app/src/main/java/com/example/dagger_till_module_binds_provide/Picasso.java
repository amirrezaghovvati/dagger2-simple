package com.example.dagger_till_module_binds_provide;

import android.util.Log;

import java.security.PublicKey;

import javax.inject.Inject;

public class Picasso implements ImageService{
    @Inject
    public Picasso(){}

    @Override
    public void getImage(String url) {
        Log.i("TAG", "Picasso is running!");
    }
}
