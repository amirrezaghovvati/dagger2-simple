package com.example.dagger_till_module_binds_provide.Pc;

import java.security.Key;

import javax.inject.Inject;

public class Hardware {
    private  Motherboard motherboard;
    private Keyboard keyboard;
    @Inject
    public Hardware(Motherboard motherboard,Keyboard keyboard) {
        this.motherboard=motherboard;
        this.keyboard=keyboard;
    }
}
