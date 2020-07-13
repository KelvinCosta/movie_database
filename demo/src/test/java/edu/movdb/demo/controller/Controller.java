package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class ControllerTests {

  @Autowired
  MockMvc mockMvc;

  @Test
  void canary(){
    assertTrue(true);
  }

  @Test
  void smokeTest(){
    assertNotNull(mockMvc);
  }

  @Test
  void movieInfo() throws Exception {
    this.mockMvc.perform(get("/filmes/waterworld/1")).andExpect(status().isOk());
  }
  
}