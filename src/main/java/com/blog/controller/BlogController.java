package com.blog.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Blog;
import com.blog.service.BlogService;

@RestController
public class BlogController {
	
    @Resource
    BlogService blogService;
	
    @RequestMapping("/getBlog")
    @Cacheable(value="blog-key")
    public Blog getBlog() {
    	Blog blog=blogService.findBlogById(Long.valueOf(123456));
    	System.out.println("get from database");
        return blog;
    }
    
    @RequestMapping("/getBlogs")
    @Cacheable(value="key-Blogs")
    public List<Blog> getBlogs() {
    	List<Blog> blogs=blogService.findAllBlogList();
    	System.out.println("get from database");
        return blogs;
    }
    
    @RequestMapping("/saveBlog")
    void saveBlog() {
    	Blog blog = new Blog();
    	blog.setContent("123456".getBytes());
    	blog.setTitle("test");
    	blog.setCreatorId("jian");
    	blog.setCreateTs(new Date());
    	blog.setLastUpdateTs(new Date());
    	blog.setPrivacy("P");
    	blogService.save(blog);
    }
}