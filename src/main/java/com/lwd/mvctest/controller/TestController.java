package com.lwd.mvctest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class TestController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("")
    public void index(ModelMap model) {
        logger.info("==============");
        logger.info("this is first param=[{}], and second param=[{}]", "1st", "2nd");
        logger.info("==============");
    }
}