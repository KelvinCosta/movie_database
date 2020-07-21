package edu.movdb.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jdk.nashorn.internal.AssertsEnabled;

class MovieTests {
  
  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void constructorTest(){
    Movie movie = new Movie("Teste", 2020, "kelvin_costa");
    assertEquals("Teste", movie.getTitle());
    assertEquals(2020, movie.getYear());
    assertEquals("kelvin_costa", movie.getImdbID());
  }

}