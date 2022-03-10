package com.example.exemplo1.controlles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlles {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Eduardo";
    }
    
    
}
