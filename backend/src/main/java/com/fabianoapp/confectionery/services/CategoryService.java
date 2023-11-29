package com.fabianoapp.confectionery.services;

import java.util.List;

import com.fabianoapp.confectionery.dto.CategoryDTO;
import com.fabianoapp.confectionery.entities.Category;
import com.fabianoapp.confectionery.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }
}
