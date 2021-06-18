package com.Axsos.Java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class abcd {

	@RequestMapping(value="/greeting")
	public class HomeController {
	    @RequestMapping(value="/")
	    public String  handleRoot(){
	      return "This is accessed view http://your_server/simple/root";
	    }
	    @RequestMapping(value="/hello")
	    public String hello(){
	      return "Hello world! What route did you use to access me?";
	    }
	    @RequestMapping(value="/goodbye")
	    public String world(){
	      return "Goodbye world!";
	    }


	}
	
	
}
