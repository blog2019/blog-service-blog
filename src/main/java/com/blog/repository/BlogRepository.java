package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    Blog findById (long id);
    
    public Blog save(Blog blog);
}