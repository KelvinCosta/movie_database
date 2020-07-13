package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

  @GetMapping("/filmes/{movieName}/{pageNumber}")
  public ResponseEntity movieInfo(){
    return new ResponseEntity(HttpStatus.OK);
  }

}