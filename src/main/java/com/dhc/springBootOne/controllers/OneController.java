package com.dhc.springBootOne.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class OneController {

    private static final Logger logger = LoggerFactory.getLogger(OneController.class);

    @GetMapping("/")
    public String helloWorld(Model model) {

        return "index";
    }
}
