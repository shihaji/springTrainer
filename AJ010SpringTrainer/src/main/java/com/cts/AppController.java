package com.cts;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  
  public int letc(){
     

	  System.out.println("hello from local");
	  

	  System.out.println("hello from repo");
	  return 0;
  }

}
