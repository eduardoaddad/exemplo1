package com.example.exemplo1.controlles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlles {
    @Autowired
    @Qualifier("nomeAplicacao")
    private String nomeAplicacao;

    @Autowired
    @Qualifier("versaoAplicacao")
    private String versaoAplicacao;

    @GetMapping(value="/")
    public String getMethodName() {
        return nomeAplicacao + " - " + versaoAplicacao;

   // @GetMapping(value="/")
   // public String getMethodName() {
   //     return "Olá Eduardo";
    }
    
    
}
