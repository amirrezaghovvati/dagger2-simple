package com.example.dagger_till_module_binds_provide.HttpClient;

import dagger.Component;

@Component
public interface ServiceComponent {
    SendService createService();
}
