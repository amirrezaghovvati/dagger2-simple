package com.example.dagger_till_module_binds_provide.Pc;

import android.util.Log;

import androidx.core.app.Person;

import javax.inject.Inject;

public class PersonalComputer {
    private Software software;
    private Hardware hardware;
    @Inject
    public PersonalComputer(Software softwares,Hardware hardware){
        this.software=softwares;
        this.hardware=hardware;
    }
    public void runPc(){
        Log.i("TAG", "Pc is running");
    }

}
