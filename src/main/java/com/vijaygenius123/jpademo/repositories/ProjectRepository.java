package com.vijaygenius123.jpademo.repositories;

import com.vijaygenius123.jpademo.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Instant;
import java.util.Collection;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByName(String name);

    @Query("select p from Project p where p.endDate in ?1 order by p.name")
    List<Project> findActiveProjects(Collection<Instant> endDates);

}