package com.ecommerce.services;

import com.ecommerce.entities.Category;
import com.ecommerce.entities.User;
import com.ecommerce.repositories.CategoryRepository;
import com.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).get();
    }

}
