package com.example.youtubetutorial01.repository;

import com.example.youtubetutorial01.domain.ProjectTask;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ProjectTaskRepository
 */
@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long>{

    
}