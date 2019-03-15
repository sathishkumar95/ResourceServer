package com.stackz.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @GetMapping("/index")
    public String index() {
        return "Everything Works";
    }


    @PostMapping("/users")
    public String userData() {
        return "You are viewing sensitive data";
    }
}
