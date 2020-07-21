package edu.movdb.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class InfoTests {

  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void infoContent(){
    List<Movie> movies = new ArrayList<Movie>();
    movies.add(new Movie("Filme1", 1001, "tt01"));
    movies.add(new Movie("Filme2", 1002, "tt02"));
    movies.add(new Movie("Filme3", 1003, "tt03"));
    movies.add(new Movie("Filme4", 1004, "tt04"));
    Info info = new Info(1, 10, 4, 1, movies);

    assertEquals("Filme1", info.getMovie(0).getTitle());
    assertEquals("Filme2", info.getMovie(1).getTitle());
    assertEquals("Filme3", info.getMovie(2).getTitle());
    assertEquals("Filme4", info.getMovie(3).getTitle());
    assertEquals(1, info.getPage());
    assertEquals(10, info.getPerPage());
    assertEquals(4, info.getTotal());
    assertEquals(1, info.getTotalPages());
  }

  @Test
  void toStringTest(){
    List<Movie> movies = new ArrayList<Movie>();
    movies.add(new Movie("Filme1", 1001, "tt01"));
    Info info = new Info(1, 10, 1, 1, movies);

    String expected = "{\"page\":1,\"per_page\":10,\"total\":1,\"total_pages\":1,\"data\":[{\"Title\":\"Filme1\",\"Year\":1001,\"imdbID\":\"tt01\"}]}";

    assertEquals(expected, info.toString());
  }

}