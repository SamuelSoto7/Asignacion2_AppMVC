package com.business;

import com.model.Article;
import com.model.Project;
import com.repository.ArticleRepository;
import com.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public ProjectService(){
    }

    public void saveProject(Project project){
        projectRepository.saveProject(project);
    }
}