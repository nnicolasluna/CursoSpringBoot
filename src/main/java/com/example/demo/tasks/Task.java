package com.example.demo.tasks;

import java.sql.Timestamp;

public class Task {
    private  String taskId;
    private  String name;
    private  String description;
    private  String category;
    private  Timestamp endedDate;
    private  String status;
    private String uuid;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private Integer createdBy;
    private Integer modifiedBy;
    private boolean deleted;

    public Task(String name, String description, String category, String status, String uuid) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.status = status;
        this.uuid = uuid;
    }

    public Task() {
    }

    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Timestamp getEndedDate() {
        return endedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getUuid() {
        return uuid;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setEndedDate(Timestamp endedDate) {
        this.endedDate = endedDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
