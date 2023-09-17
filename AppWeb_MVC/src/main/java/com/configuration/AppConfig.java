package com.configuration;

import com.business.ArticleService;
import com.business.JournalService;
import com.business.ProjectService;
import com.model.Article;
import com.model.Journal;
import com.model.Project;
import com.repository.ArticleRepository;
import com.repository.JournalRepository;
import com.repository.ProjectRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Article article(){
        return new Article();
    }

    @Bean
    public ArticleService articleService(){
        return new ArticleService();
    }

    @Bean
    public ArticleRepository articleRepository(){
        return new ArticleRepository();
    }

    @Bean
    public Project project(){
        return new Project();
    }

    @Bean
    public ProjectService projectService(){
        return new ProjectService();
    }

    @Bean
    public ProjectRepository projectRepository(){
        return new ProjectRepository();
    }

    @Bean
    public Journal journal(){
        return new Journal();
    }

    @Bean
    public JournalService journalService(){
        return new JournalService();
    }

    @Bean
    public JournalRepository journalRepository(){
        return new JournalRepository();
    }
}
