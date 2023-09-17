package com.business;

import com.model.Article;
import com.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public ArticleService(){
    }

    public void saveArticle(Article article){
        articleRepository.saveArticle(article);
    }

}
