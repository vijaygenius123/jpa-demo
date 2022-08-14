package com.vijaygenius123.jpademo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "project", indexes = {
        @Index(name = "idx_project_name", columnList = "name")
})
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();

    public Long getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "start_date")
    private Instant startDate;

    public Instant getStartDate() {
        return startDate;
    }

    @Column(name = "end_date")
    private Instant endDate;

    public Instant getEndDate() {
        return endDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private User manager;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

}