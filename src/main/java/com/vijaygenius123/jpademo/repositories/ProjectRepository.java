package com.vijaygenius123.jpademo.repositories;

import com.vijaygenius123.jpademo.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}