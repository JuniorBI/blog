package com.spring.blog.service.implement;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;
import com.spring.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// implemntando os 3 metodos para o blog

@Service

public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> FindAll() {
        return blogRepository.findAll();
    }

    @Override
    public Post FindById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }
}
