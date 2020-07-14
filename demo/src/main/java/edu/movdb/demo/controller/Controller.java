package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

  @RequestMapping(
    path = "/filmes/{movieName}/{pageNumber}", 
    produces = "application/json; charset = UTF-8")
  public ResponseEntity<String> movieInfo(
    @PathVariable("movieName")  String movieName,
    @PathVariable("pageNumber") String pageNumber){

      String searchURL = String.format("https://jsonmock.hackerrank.com/api/movies/search/title=%s&page=%s", movieName, pageNumber);
      RestTemplate rt = new RestTemplate();
      return rt.getForEntity(searchURL, String.class);
  }

}