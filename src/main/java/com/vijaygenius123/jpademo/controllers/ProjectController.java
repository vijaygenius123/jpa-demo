package com.vijaygenius123.jpademo.controllers;

import com.vijaygenius123.jpademo.dtos.ProjectDto;
import com.vijaygenius123.jpademo.entities.Project;
import com.vijaygenius123.jpademo.mappers.ProjectMapper;
import com.vijaygenius123.jpademo.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {

    @Autowired
    private final ProjectMapper projectMapper;

    @Autowired
    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository, ProjectMapper projectMapper){
        this.projectMapper = projectMapper;
        this.projectRepository = projectRepository;
    }

    @GetMapping("/project/find/{name}")
    public List<ProjectDto> findByName(@PathVariable String name){
        List<Project> projectList = projectRepository.findByName(name);
        return projectList.stream()
                .map(projectMapper::projectToProjectDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/project/new")
    public  ProjectDto saveProject(@RequestBody @NonNull @Valid ProjectDto projectDto){
        Project projectEntity = projectMapper.projectDtoToProject(projectDto);
        return projectMapper.projectToProjectDto(projectRepository.save(projectEntity));
    }

}
