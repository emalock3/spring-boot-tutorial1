package com.github.emalock3.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@Configuration
@EnableAutoConfiguration
@RequestMapping("/hello")
public class Example {

    @RequestMapping(value="/{name}", method=RequestMethod.GET)
    @ResponseBody
    public String home(@PathVariable String name) {
        return String.format("Hello, %s!", name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
