/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author banti
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("name", "Saurabh Kumar");

        return "welcome";
    }
}
