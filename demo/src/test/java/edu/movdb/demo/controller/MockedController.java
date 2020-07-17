package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class ControllerTests {

  @Autowired
  RestTemplate restTemplate;

  @Mock
  Controller controller;

  @Test
  void canary(){
    assertTrue(true);
  }

  @BeforeEach
  public void init (){
      when(
        controller.movieInfo(anyString(), anyString())).thenReturn(new ResponseEntity<String>("Retorno", HttpStatus.OK));
  }

  @Test
  void smokeTest(){
    assertNotNull(controller);
  }

  @Test
  void mockTest() {
    ResponseEntity<String> resp = controller.movieInfo("waterland", "1");
    assertEquals("Retorno", resp.getBody());
    assertEquals(HttpStatus.OK, resp.getStatusCode());
  }

  // @Test
  // void movieInfoIsJson() throws Exception {
  //   this.mockMvc.perform(get("/filmes/waterworld/1")).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
  // }

  // @Test
  // void movieInfoJsonInfo() throws Exception {
  //   this.mockMvc.perform(get("/filmes/waterworld/1"))
  //   .andExpect(jsonPath("$.page").value("1"))
  //   .andExpect(jsonPath("$.per_page").value("10"))
  //   .andExpect(jsonPath("$.total").value("2770"))
  //   .andExpect(jsonPath("$.total_pages").value("277"));
  // }

  // @Test
  // void movieInfoStatusOkNoPageNumber() throws Exception {
  //   this.mockMvc.perform(get("/filmes/waterworld")).andExpect(status().isOk());
  // }
  
}