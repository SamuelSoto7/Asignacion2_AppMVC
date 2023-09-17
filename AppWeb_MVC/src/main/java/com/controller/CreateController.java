package com.controller;

import com.business.ArticleService;
import com.business.JournalService;
import com.business.ProjectService;
import com.configuration.AppConfig;
import com.model.Article;
import com.model.Journal;
import com.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateController {

    ArticleService articleService;
    ProjectService projectService;
    JournalService journalService;

    @RequestMapping(value="create_article")
    public ModelAndView createArticleGet(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        journalService = (JournalService) ctx.getBean("journalService");
        ModelAndView model = new ModelAndView("new_article");
        Article article = new Article();
        model.addObject("articleFrm", article);
        model.addObject("listJournals", journalService.listJournal());
        return model;
    }

    @RequestMapping(value ="post_article", method = RequestMethod.POST)
    public ModelAndView createArticlePost(@ModelAttribute("articleFrm")Article article){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        articleService = (ArticleService) ctx.getBean("articleService");
        articleService.saveArticle(article);
        return new ModelAndView("redirect:/welcome");
    }

    @RequestMapping(value="create_project")
    public ModelAndView createProjectGet(){
        ModelAndView model = new ModelAndView("new_project");
        Project project = new Project();
        model.addObject("projectFrm", project);
        return model;
    }

    @RequestMapping(value ="post_project", method = RequestMethod.POST)
    public ModelAndView createProjectPost(@ModelAttribute("projectFrm")Project project){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        projectService = (ProjectService) ctx.getBean("projectService");
        projectService.saveProject(project);
        return new ModelAndView("redirect:/welcome");
    }

    @RequestMapping(value="create_journal")
    public ModelAndView createJournalGet(){
        ModelAndView model = new ModelAndView("new_revista");
        Journal journal = new Journal();
        model.addObject("journalFrm", journal);
        return model;
    }

    @RequestMapping(value ="post_journal", method = RequestMethod.POST)
    public ModelAndView createJournalPost(@ModelAttribute("journalFrm") Journal journal){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        journalService = (JournalService) ctx.getBean("journalService");
        journalService.saveJournal(journal);
        return new ModelAndView("redirect:/welcome");
    }
}
