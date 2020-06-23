package com.bo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ce {

    @RequestMapping("/do")
    public ModelAndView po() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ce.jsp");
        return mv;
    }

}
