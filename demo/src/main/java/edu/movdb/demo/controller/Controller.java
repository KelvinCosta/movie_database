package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping(value = "/")
  public String home(){
    return "Home Page";
  }

}