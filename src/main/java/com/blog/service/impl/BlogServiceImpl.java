package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Blog;
import com.blog.repository.BlogRepository;
import com.blog.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAllBlogList() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
    	blogRepository.save(blog);
    }

    @Override
    public void edit(Blog blog) {
    	blogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog) {
    	blogRepository.delete(blog);
    }
}


