package com.example.springcertification.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component("blogService")
public class BlogService {

    public List<String> getBlogs()
    {
       /*Stream to List
       Stream<String> namesStream = Stream.of("Jay", "Ram", "Mohan");
        List<String> collect1 = namesStream.collect(Collectors.toList());
       */

        Stream<List<String>> blogStream = Stream.of(
                Arrays.asList("blog1","blog2","blog3"),
                Arrays.asList("blog4","blog5","blog6"),
                Arrays.asList("blog7","blog8","blog9"));
        List<List<String>> blogsList = blogStream.collect(Collectors.toList());
        Stream<List<String>> streams = blogsList.stream();
        Stream<String> stringStream = blogsList.stream().flatMap(bList -> bList.stream());
        List<String> blogs = blogsList.stream().flatMap(bList -> bList.stream()).collect(Collectors.toList());
        return blogs;
    }

    public List<String> getAuthors()
    {
        List<String> authorList = List.of("Tim", "Jim", "Tom");
        return authorList;
    }
}
