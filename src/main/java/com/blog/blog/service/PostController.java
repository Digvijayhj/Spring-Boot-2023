package com.blog.blog.service;

import com.blog.blog.model.TableA;
import com.blog.blog.repository.TableARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private TableARepository postRepository;

    @GetMapping(
            "/get"
    )
    List<TableA> getPost() {
        return postRepository.findAll();
    }

    @GetMapping("/get/resultSet")
    Page<Object> getResultSet(@RequestParam Date fromDate, @RequestParam Date endDate) {
        var pageRequest = PageRequest.of(0,10);
        return postRepository.getResultSet("Hello World!", fromDate, endDate, pageRequest);
    }
}
