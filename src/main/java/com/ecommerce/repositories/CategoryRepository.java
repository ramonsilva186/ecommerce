package com.ecommerce.repositories;

import com.ecommerce.entities.Category;
import com.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
