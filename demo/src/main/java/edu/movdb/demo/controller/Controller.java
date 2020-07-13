package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

  @RequestMapping(
    path = "/filmes/{movieName}/{pageNumber}", 
    produces = "application/json; charset = UTF-8")
  public ResponseEntity movieInfo(
    @PathVariable("movieName")  String movieName,
    @PathVariable("pageNumber") String pageNumber){
    return new ResponseEntity(HttpStatus.OK);
  }

}