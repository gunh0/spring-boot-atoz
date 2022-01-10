package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        logger.info("user");
        return "user";
    }

    @GetMapping("/board")
    @ResponseBody
    public String board() {
        logger.info("board");
        return "board";
    }
}