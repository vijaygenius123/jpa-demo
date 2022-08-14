package com.vijaygenius123.jpademo.dtos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ProjectDto implements Serializable {
    private final Long id;
    private final List<TaskDto> tasks;
    private final String name;
    private final UserDto manager;

    public ProjectDto(Long id, List<TaskDto> tasks, String name, UserDto manager) {
        this.id = id;
        this.tasks = tasks;
        this.name = name;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public List<TaskDto> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public UserDto getManager() {
        return manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectDto entity = (ProjectDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tasks, entity.tasks) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.manager, entity.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tasks, name, manager);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tasks = " + tasks + ", " +
                "name = " + name + ", " +
                "manager = " + manager + ")";
    }
}
