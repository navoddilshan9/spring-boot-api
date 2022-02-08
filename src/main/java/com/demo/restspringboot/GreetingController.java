package com.demo.restspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class GreetingController {
    //http://localhost:8080/
    @GetMapping(value="/hello/{name}")
    public String greeting(@PathVariable String  name){
        return  "Hello "+name;
    }
}
