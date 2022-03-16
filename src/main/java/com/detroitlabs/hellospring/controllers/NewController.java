package com.detroitlabs.hellospring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class NewController {
    @RequestMapping("/datetime")
    @ResponseBody
    public String datetime()  {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm");
        String dateTimeString = formatter.format(now);

      return "dateTimeString";
    }
}
