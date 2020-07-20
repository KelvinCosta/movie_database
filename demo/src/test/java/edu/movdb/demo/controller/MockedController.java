package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.json.simple.JSONObject;


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
    HttpHeaders header = new HttpHeaders();
    header.setContentType(MediaType.APPLICATION_JSON);

    JSONObject respBody = new JSONObject();
    respBody.put("page", 1);
    respBody.put("per_page", 10);
    respBody.put("total", 573);
    respBody.put("total_pages", 58);

      when(
        controller.movieInfo(anyString(), anyString())).thenReturn(new ResponseEntity<String>(respBody.toString(), header, HttpStatus.OK));
  }

  @Test
  void smokeTest(){
    assertNotNull(controller);
  }

  @Test
  void mockTest() {
    ResponseEntity<String> resp = controller.movieInfo("waterland", "1");
    assertEquals(HttpStatus.OK, resp.getStatusCode());
    assertEquals(MediaType.APPLICATION_JSON, resp.getHeaders().getContentType());
  }

  @Test
  void movieInfoJsonInfo() {
    ResponseEntity<String> resp = controller.movieInfo("waterland", "1");
    String actual = resp.getBody();
    assertTrue(actual.contains("page") && actual.contains("1"));
    assertTrue(actual.contains("per_page") && actual.contains("10"));
    assertTrue(actual.contains("total") && actual.contains("573"));
    assertTrue(actual.contains("total_pages") && actual.contains("58"));
  }
  
}