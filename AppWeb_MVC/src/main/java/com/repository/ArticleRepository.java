package com.repository;

import com.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    List<Article> articles = new ArrayList<>();

    public ArticleRepository(){

    }

    public void saveArticle(Article article){
        articles.add(article);
    }
}
