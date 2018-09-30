package com.mydubbo.provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydubbo.provider.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
