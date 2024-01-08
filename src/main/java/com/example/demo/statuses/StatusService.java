package com.example.demo.statuses;

import java.util.List;

public interface StatusService {
    public List<StatusDTO> getAll();

    StatusDTO create(StatusDTO dto);
}
