package edu.movdb.demo.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockedController {
  
  @Test
  void canary(){
    assertTrue(true);
  }

}
