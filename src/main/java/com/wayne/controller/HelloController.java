package com.wayne.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class HelloController {

    //private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String index(HttpServletRequest request) {
        //log.info("request client info:"+request.getRemoteAddr());
        return "index";
    }

    @RequestMapping("/life")
    public String life() {
        return "life";
    }

    @RequestMapping("/shoot")
    public String qiubite() {
        return "4";
    }

    @RequestMapping("/support")
    public String zoumadeng() {
        return "15";
    }

    @RequestMapping("/hug")
    public String hug() {
        return "30";
    }

    @RequestMapping("/tree")
    public String greenTree() {
        return "41";
    }
}
