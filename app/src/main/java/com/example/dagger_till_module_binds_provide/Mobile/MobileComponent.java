package com.example.dagger_till_module_binds_provide.Mobile;

import dagger.Component;

@Component(modules = {BoardModule.class})
public interface MobileComponent {
    Mobile createMobile();
}
