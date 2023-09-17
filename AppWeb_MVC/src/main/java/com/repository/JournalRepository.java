package com.repository;

import com.model.Article;
import com.model.Journal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JournalRepository {
    List<Journal> journals = new ArrayList<>();

    public JournalRepository(){
        journals.add(new Journal("Journal1","1","IDX"));
        journals.add(new Journal("Journal2","2","IDX"));
        journals.add(new Journal("Journal3","3","IDX"));
        journals.add(new Journal("Journal4","4","IDX"));
        journals.add(new Journal("Journal5","5","IDX"));
    }

    public void saveJournal(Journal journal){
        journals.add(journal);
    }

    public List<Journal> getJournals(){
        return journals;
    }
}