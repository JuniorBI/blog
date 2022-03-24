package com.spring.blog.service;

import com.spring.blog.model.Post;

import java.util.List;

public interface BlogService {
    List<Post> FindAll();
    Post FindById(long id);
    Post save(Post post);
}
