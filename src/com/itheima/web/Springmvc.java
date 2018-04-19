package com.itheima.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Springmvc {
    /**
     * @param model
     * @return
     */
    @RequestMapping("login")
    public String springmvc(Model model){
        model.addAttribute("msg","测试页面...");

        return "/WEB-INF/views/login.jsp";
    }

}
