package edu.movdb.demo.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = Controller.class)
class ControllerTests {  

  @Autowired
  MockMvc mockMvc;

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

  @Test
  void home200() throws Exception {
    mockMvc.perform(get("/")).andExpect(status().isOk());
  }

  @Test
  void page404() throws Exception {
    mockMvc.perform(get("/nonnon")).andExpect(status().isNotFound());
  }

}