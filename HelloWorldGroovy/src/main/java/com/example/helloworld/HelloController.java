package com.example.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/getData")
    public String hello(){
        return "hello world!!! Devam kumar this side";
    }
}
