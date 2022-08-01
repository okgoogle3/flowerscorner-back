package com.jjour.service;

import com.jjour.model.ArticleModel;
import com.jjour.repo.ArticleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    public final ArticleRepo articleRepo;

    public List<ArticleModel> getAllArticles(){
        return articleRepo.findAll();
    }
}
