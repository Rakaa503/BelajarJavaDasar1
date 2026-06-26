package com.avidev.onlinestore.service;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.avidev.onlinestore.entity.Category;
import com.avidev.onlinestore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Menampilkan semua kategori
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Menampilkan kategori berdasarkan ID
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Menyimpan kategori baru
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Mengupdate kategori
    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);

        if (existingCategory != null) {
            existingCategory.setName(category.getName());
            return categoryRepository.save(existingCategory);
        }

        return null;
    }

    // Menghapus kategori
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}