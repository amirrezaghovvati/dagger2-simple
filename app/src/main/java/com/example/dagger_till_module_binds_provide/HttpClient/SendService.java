package com.example.dagger_till_module_binds_provide.HttpClient;

import javax.inject.Inject;

public class SendService {
    private Retrofit retrofit;
    @Inject
    public SendService(Retrofit retrofit){
        this.retrofit=retrofit;
    }
    public void sendRequst(String url,String method){
        retrofit.sendRequst(url,method);
    }
}
