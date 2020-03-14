package com.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping("/test")
public class testController {

    @RequestMapping("/t")
    public ModelAndView testView() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }
}
