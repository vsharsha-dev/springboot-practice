package com.springpractice.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("HomeController called");
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int number1, @RequestParam("num2") int number2, ModelAndView mv) {

        int result = number1+number2;

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }
}
