package com.talizinstory.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EcommerceController {

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("teste/index");
    }
}
