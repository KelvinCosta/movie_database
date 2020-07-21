package edu.movdb.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jdk.nashorn.internal.AssertsEnabled;

class MovieTests {

  Movie movie = new Movie("Teste", 2020, "kelvin_costa");
  
  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void constructorTest(){
    assertEquals("Teste", movie.getTitle());
    assertEquals(2020, movie.getYear());
    assertEquals("kelvin_costa", movie.getImdbID());
  }

  @Test
  void toStringTest(){
    String expected = "{\"Title\":\"Teste\",\"Year\":2020,\"imdbID\":\"kelvin_costa\"}";
    assertEquals(expected, movie.toString());
  }

}