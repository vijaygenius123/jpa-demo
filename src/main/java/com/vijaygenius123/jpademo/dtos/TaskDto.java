package com.vijaygenius123.jpademo.dtos;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class TaskDto implements Serializable {
    private final Long id;
    private final Instant startDate;
    private final String name;
    private final Instant endDate;

    public TaskDto(Long id, Instant startDate, String name, Instant endDate) {
        this.id = id;
        this.startDate = startDate;
        this.name = name;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public Instant getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDto entity = (TaskDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.startDate, entity.startDate) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.endDate, entity.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, name, endDate);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "startDate = " + startDate + ", " +
                "name = " + name + ", " +
                "endDate = " + endDate + ")";
    }
}
