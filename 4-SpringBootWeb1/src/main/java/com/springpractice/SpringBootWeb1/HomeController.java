package com.springpractice.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("HomeController called");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int number1, @RequestParam("num2") int number2, Model model) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = number1+number2;

        model.addAttribute("result", result);

//        // This session can be accessed directly in result.jsp
//        session.setAttribute("result", result);

        return "result.jsp";
    }
}
