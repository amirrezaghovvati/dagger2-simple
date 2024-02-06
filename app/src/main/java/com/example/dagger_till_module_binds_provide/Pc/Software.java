package com.example.dagger_till_module_binds_provide.Pc;

import javax.inject.Inject;

public class Software {
    private MSEdge edge;
    private MSWord word;
    @Inject
    public Software(MSEdge edge,MSWord word) {
        this.edge=edge;
        this.word=word;
    }
}
