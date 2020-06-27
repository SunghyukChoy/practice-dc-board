package com.fakedc.practiceboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @GetMapping(value = "/")
  public ModelAndView home(@RequestParam(required = false, defaultValue = "annonymous") String name,
      @RequestParam(required = false, defaultValue = "10") Integer age) {
    ModelAndView mv = new ModelAndView("home");

    mv.addObject("name", name);
    mv.addObject("age", age);

    return mv;
  }

}
