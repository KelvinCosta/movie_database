package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class ControllerTests {

  @Autowired
  Controller controller;

  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void smokeTest(){
    assertNotNull(controller);
  }
  
}