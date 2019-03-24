package com.example.youtubetutorial01.service;

import com.example.youtubetutorial01.domain.ProjectTask;
import com.example.youtubetutorial01.repository.ProjectTaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProjectTaskService
 */
@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask) {

        if(projectTask.getStatus() == null || projectTask.getStatus() == ""){
            projectTask.setStatus("TO_DO");
        }
        return projectTaskRepository.save(projectTask);
    }
    
    public Iterable<ProjectTask> findAll() {
        return projectTaskRepository.findAll();
    }

    public ProjectTask findById(Long id) {
        return projectTaskRepository.getById(id);
    }
}