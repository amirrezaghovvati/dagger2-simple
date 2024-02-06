package com.example.dagger_till_module_binds_provide.HttpClient;

import android.util.Log;

public class Volley implements SendRequest{
    @Override
    public void sendRequst(String url, String method) {
        Log.i("TAG", "Volley sendRequst: ");
    }
}
