package com.spring.blog.repository;

import com.spring.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {



}
