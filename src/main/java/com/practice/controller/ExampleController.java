package com.practice.controller;

import com.practice.component.ExampleComponent;
import com.practice.model.Person;
import com.practice.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/example")
public class ExampleController
{
    private static final String EXAMPLE_VIEW = "example";

    @Autowired
    @Qualifier("exampleService")
    private ExampleService exampleService;

    @Autowired
    @Qualifier("exampleComponent")
    private ExampleComponent exampleComponent;

    @GetMapping("/exampleString")
    //@RequestMapping(value="/exampleString", method=RequestMethod.GET)
    public String exampleStering(Model model)
    {
        exampleComponent.sayHello();
        model.addAttribute("people", exampleService.getListPeople());
        return EXAMPLE_VIEW;
    }

    @GetMapping("/exampleMAV")
    //@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
    public ModelAndView exampleMAV()
    {
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
        mav.addObject("people", exampleService.getListPeople());
        return mav;
    }
}
