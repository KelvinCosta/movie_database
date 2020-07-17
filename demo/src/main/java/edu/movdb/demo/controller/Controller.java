package edu.movdb.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@RestController
public class Controller {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  } 

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping(
    value = {"/filmes/{movieName}/{pageNumber}", "/filmes/{movieName}"}, 
    produces = "application/json; charset = UTF-8")
  public String movieInfo(
    @PathVariable("movieName")  String movieName,
    @PathVariable(value = "pageNumber", required = false) String pageNumber){
      if(pageNumber == null) {pageNumber = "1";}
      String searchURL = String.format("https://jsonmock.hackerrank.com/api/movies/search/title=%s&page=%s", movieName, pageNumber);
      ResponseEntity<String> resp = restTemplate.getForEntity(searchURL, String.class);
      return resp.getStatusCode() == HttpStatus.OK ? resp.getBody() : null;
  }

}