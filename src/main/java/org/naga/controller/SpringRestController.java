package org.naga.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class SpringRestController {
 @RequestMapping(value = "/{version}/{name}", method = RequestMethod.GET)
 public String hello(@PathVariable String version,@PathVariable String name) {
	 System.out.println("............");
  String result="Hello "+name+"Version..."+version;  
  return result;
 }
}