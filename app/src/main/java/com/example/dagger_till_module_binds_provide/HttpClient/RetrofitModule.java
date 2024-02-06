package com.example.dagger_till_module_binds_provide.HttpClient;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class RetrofitModule {
    @Provides
    static public Retrofit buildRetrofit(){
        return new Retrofit();
    }
}
