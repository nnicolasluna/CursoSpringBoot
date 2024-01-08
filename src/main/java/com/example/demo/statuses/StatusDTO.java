package com.example.demo.statuses;

import java.security.Timestamp;

public class StatusDTO {
    private String uuid;
    private  String name;
    private  String description;

    private Timestamp endedDate;
    private  String status;

    public StatusDTO() {
    }

    public StatusDTO(String name, String description, Timestamp endedDate, String status) {
        this.name = name;
        this.description = description;
        this.endedDate = endedDate;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getEndedDate() {
        return endedDate;
    }

    public void setEndedDate(Timestamp endedDate) {
        this.endedDate = endedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
