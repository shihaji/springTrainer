package com.cts;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  
  public int letc(){
     
	  //This is a sysout
	  System.out.println("hello from local");
	  

	  System.out.println("hello from repo");
	  
	  System.out.println("hello from mybranch");
	  return 0;
  }

}
