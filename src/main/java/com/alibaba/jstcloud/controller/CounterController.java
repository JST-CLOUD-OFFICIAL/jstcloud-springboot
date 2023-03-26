package com.alibaba.jstcloud.controller;

import com.alibaba.jstcloud.dto.Counter;
import com.alibaba.jstcloud.service.CounterService;
import com.alibaba.jstcloud.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RequestMapping("/counter")
public class CounterController {
    private final static Logger logger = LoggerFactory.getLogger(CounterController.class);

    @Resource
    private CounterService counterService;


    @RequestMapping(value = "/increment", method = RequestMethod.GET)
    public Response<Counter> increment(){
        try {
            Counter counter = counterService.increment();
            return Response.success(counter);
        }catch (Exception e){
            logger.error("counter increment error: ", e);
            return Response.fail(400, "系统错误");
        }
    }

    @RequestMapping(value = "/decrement", method = RequestMethod.GET)
    public Response<Counter> decrement(){
        try {
            Counter counter = counterService.decrement();
            return Response.success(counter);
        }catch (Exception e){
            logger.error("counter decrement error: ", e);
            return Response.fail(400, "系统错误");
        }
    }


    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public String index() {
        System.out.println("aaa");
        return "redirect:/index.html";
    }

}
