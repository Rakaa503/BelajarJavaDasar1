package com.avidev.onlinestore.repository;

import com.avidev.onlinestore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}