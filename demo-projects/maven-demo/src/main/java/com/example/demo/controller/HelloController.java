package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * @return Welcome
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/api/welcome")
    @ResponseBody
    public String apiWelcome() {
        logger.info("welcome");
        return "welcome";
    }
}
