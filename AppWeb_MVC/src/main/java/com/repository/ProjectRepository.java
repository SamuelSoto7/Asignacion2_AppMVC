package com.repository;

import com.model.Article;
import com.model.Project;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectRepository {
    List<Project> projects = new ArrayList<>();

    public ProjectRepository(){

    }

    public void saveProject(Project project){
        projects.add(project);
    }
}
