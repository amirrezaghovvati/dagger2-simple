package com.example.dagger_till_module_binds_provide.Pc;

import com.example.dagger_till_module_binds_provide.ImageService;

import javax.inject.Inject;

public class LoadingImage {
    private ImageService imageService;
    @Inject
    public LoadingImage(ImageService imageService){
        this.imageService=imageService;
    }
    public void loadImage(){
        imageService.getImage("uri");
    }
}
