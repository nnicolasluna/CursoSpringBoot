package com.example.demo.statuses;

import java.util.Collection;

public interface StatusRepository {
    Collection<Status> findAll();

    Status save(Status status);
}
