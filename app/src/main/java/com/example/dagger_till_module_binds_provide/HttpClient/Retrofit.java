package com.example.dagger_till_module_binds_provide.HttpClient;

import android.util.Log;

import javax.inject.Inject;


public class Retrofit implements SendRequest{
    @Inject
    public Retrofit(){}
    @Override
    public void sendRequst(String url, String method) {
        Log.i("TAG", "Retrofit sendRequst: ");
    }
}
