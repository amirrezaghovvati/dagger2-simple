package com.example.dagger_till_module_binds_provide;

import com.example.dagger_till_module_binds_provide.Pc.ImagServiceModule;
import com.example.dagger_till_module_binds_provide.Pc.LoadingImage;

import dagger.Component;

@Component(modules = {ImagServiceModule.class})
public interface ImageComponent {
    LoadingImage buildImage();
}
