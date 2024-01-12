package com.example.demo.tasks;

import java.sql.Timestamp;
import java.util.Objects;

public class TaskDTO {
    private String uuid;
    private  String name;
    private  String description;
    private  String category;

    private  String status;

    public TaskDTO() {
    }

    public TaskDTO(String uuid, String name, String description, String category, Timestamp endedDate, String status) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.category = category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDTO taskDTO = (TaskDTO) o;
        return Objects.equals(uuid, taskDTO.uuid) && Objects.equals(name, taskDTO.name) && Objects.equals(description, taskDTO.description) && Objects.equals(category, taskDTO.category) && Objects.equals(status, taskDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, description, category, status);
    }

    @Override
    public String toString() {
        return "TaskDTO{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
