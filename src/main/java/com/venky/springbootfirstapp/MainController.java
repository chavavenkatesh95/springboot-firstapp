package com.venky.springbootfirstapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/{Fname}/{Lname}")
    String Greetings(@PathVariable("Fname") String fname,@PathVariable("Lname") String lname){
        return "Hello " + fname + lname;
    }
}
