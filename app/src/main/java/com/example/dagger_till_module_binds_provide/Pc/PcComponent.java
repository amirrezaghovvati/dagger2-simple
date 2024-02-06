package com.example.dagger_till_module_binds_provide.Pc;

import dagger.Component;

@Component
public interface PcComponent {
    PersonalComputer createPc();
}
