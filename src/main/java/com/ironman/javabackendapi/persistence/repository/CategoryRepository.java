package com.ironman.javabackendapi.persistence.repository;

import com.ironman.javabackendapi.persistence.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
