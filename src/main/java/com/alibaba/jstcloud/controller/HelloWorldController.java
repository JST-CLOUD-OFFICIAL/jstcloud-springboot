package com.alibaba.jstcloud.controller;

import com.alibaba.jstcloud.web.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/")
    public Response<String> hello(){
        return Response.success("Welcome to jst appengine, hello world!");
    }

}
