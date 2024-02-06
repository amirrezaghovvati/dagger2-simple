package com.example.dagger_till_module_binds_provide.Mobile;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class BoardModule {
    @Binds
    abstract Board createBoard(Camera camera);
}
