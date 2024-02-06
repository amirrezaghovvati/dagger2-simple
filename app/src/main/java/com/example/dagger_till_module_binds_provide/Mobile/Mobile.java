package com.example.dagger_till_module_binds_provide.Mobile;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Board board;
    private Screen screen;
    @Inject
    public Mobile(Board board,Screen screen){
        this.board=board;
        this.screen=screen;
    }
    public void runMobile(){
        Log.i("TAG", "Mobile is running! ");
    }
}
