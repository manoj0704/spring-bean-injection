package com.manoj.playground.simplespringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodOldRestController {

   private final SomeComponent someComponent;

   @Autowired //Even specifying autowired is no more mandatory with latest versions of spring
   public GoodOldRestController(SomeComponent someComponent) {
      this.someComponent = someComponent;
   }

   @GetMapping("hello")
   public String printHello() {
      return someComponent.doSomething();
   }
}
