package com.jjour.service;

import com.jjour.model.CategoryModel;
import com.jjour.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {
    public final CategoryRepo categoryRepo;

    public List<CategoryModel> getAllCategories(){
        return categoryRepo.findAll();
    }
}