package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

  @RequestMapping(
    path = "/filmes/{movieName}/{pageNumber}", 
    produces = "application/json; charset = UTF-8")
  public ResponseEntity<String> movieInfo(
    @PathVariable("movieName")  String movieName,
    @PathVariable("pageNumber") String pageNumber){
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set("content-type", "application/json; charset=utf-8");
    return new ResponseEntity<String>("", responseHeaders, HttpStatus.OK);
  }

}