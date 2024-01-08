package com.example.demo.statuses;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class StatusRepositoryBean implements StatusRepository {
    @Override
    public Collection<Status> findAll(){
        return Collections.singleton(new Status());
    }

    @Override
    public Status save(Status status) {
        return status;
    }
}
