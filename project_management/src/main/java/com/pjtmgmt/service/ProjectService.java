package com.pjtmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjtmgmt.exceptions.ProjectIdException;
import com.pjtmgmt.model.Project;
import com.pjtmgmt.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectIdException("Project Id " + project.getProjectIdentifier().toUpperCase() + " alread exists");
		}
		
		
	}
}
