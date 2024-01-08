package com.example.demo.statuses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StatusSserviceBean implements  StatusService{
    @Autowired
    private StatusMapper mapper;
    @Autowired
    private StatusRepository statusRepository;
    public List<StatusDTO> getAll(){
        return statusRepository
                .findAll()
                .stream()
                .map(status -> mapper.toDTO(status))
                .collect(Collectors.toList());
    }
    @Override
    public StatusDTO create(StatusDTO dto){
        Status status = mapper.toModel(dto);
        Status saveTask = statusRepository.save(status);
        return mapper.toDTO(saveTask);
    }
}
