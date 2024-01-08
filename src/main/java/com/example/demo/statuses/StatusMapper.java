package com.example.demo.statuses;

import org.springframework.stereotype.Component;

@Component
public class StatusMapper {
    public  StatusDTO toDTO(Status status){
        return new StatusDTO();
    }
    public Status toModel(StatusDTO dto){
        return  new Status();
    }
}
