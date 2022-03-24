package com.spring.blog.utils;

import com.spring.blog.model.Post;
import com.spring.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataD {

        @Autowired
        BlogRepository blogRepository;


        //@PostConstruct
        public void savePosts(){

            List<Post> postList = new ArrayList<>();
            Post post1 = new Post();
            post1.setAutor("Pedro Resende");
            post1.setData(LocalDate.now());
            post1.setTitulo("Tecnologia");
            post1.setTexto("Um monte de coisa escrita aqui!!");

            Post post2 = new Post();
            post2.setAutor("Antonio Junior");
            post2.setData(LocalDate.now());
            post2.setTitulo("Tecnologia");
            post2.setTexto("Um monte de coisa escrita aqui!!");

            postList.add(post1);
            postList.add(post2);

            for(Post post: postList){
                Post postSaved = blogRepository.save(post);
                System.out.println(postSaved.getId());
            }
        }
    }

