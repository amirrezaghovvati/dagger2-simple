package com.example.dagger_till_module_binds_provide.Pc;

import com.example.dagger_till_module_binds_provide.Glide;
import com.example.dagger_till_module_binds_provide.ImageService;
import com.example.dagger_till_module_binds_provide.Picasso;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ImagServiceModule {
    @Binds
    abstract ImageService createImageService(Glide picasso);
}
