package com.detroitlabs.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String sayHello() {
      return "Hello, world! this is our first Spring Boot application!";


    }
    @RequestMapping("/happydog")
    @ResponseBody
    public String happyDog() {
        return "Woof, Woof";



    }


}
