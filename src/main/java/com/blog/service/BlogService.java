package com.blog.service;

import java.util.List;

import com.blog.entity.Blog;

public interface BlogService {

    public List<Blog> findAllBlogList();

    public Blog findBlogById(long id);

    public void save(Blog blog);

    public void edit(Blog blog);

    public void delete(Blog blog);

}
