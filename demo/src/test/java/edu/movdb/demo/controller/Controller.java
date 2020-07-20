package edu.movdb.demo.controller;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(controllers = Controller.class)
class ControllerTests {  

  @MockBean
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