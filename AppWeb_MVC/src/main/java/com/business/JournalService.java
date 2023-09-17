package com.business;

import com.model.Article;
import com.model.Journal;
import com.repository.ArticleRepository;
import com.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    JournalRepository journalRepository;

    public JournalService(){
    }

    public void saveJournal(Journal journal){
        journalRepository.saveJournal(journal);
    }

    public List<Journal> listJournal(){
        return journalRepository.getJournals();
    }
}