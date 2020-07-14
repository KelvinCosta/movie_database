package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.hamcrest.Matchers.is;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

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
  void movieInfoStatusOk() throws Exception {
    this.mockMvc.perform(get("/filmes/waterworld/1")).andExpect(status().isOk());
  }

  @Test
  void movieInfoIsJson() throws Exception {
    this.mockMvc.perform(get("/filmes/waterworld/1")).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
  }

  @Test
  void movieInfoJsonInfo() throws Exception {
    this.mockMvc.perform(get("/filmes/waterworld/1"))
    .andExpect(jsonPath("$.page").value("1"))
    .andExpect(jsonPath("$.per_page").value("10"))
    .andExpect(jsonPath("$.total").value("2770"))
    .andExpect(jsonPath("$.total_pages").value("277"));
  }

  @Test
  void movieInfoStatusOkNoPageNumber() throws Exception {
    this.mockMvc.perform(get("/filmes/waterworld")).andExpect(status().isOk());
  }
  
}