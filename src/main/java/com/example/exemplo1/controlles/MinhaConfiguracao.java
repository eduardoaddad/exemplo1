package com.example.exemplo1.controlles;

import com.example.exemplo.Development;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguracao {
   /* @Bean(name = "nomeAplicacao")
    public String nomeAplicacao(){
        return "Aula 2 - Teste";
    }
    @Bean(name = "versaoAplicacao")
    public String versaoAplicacao(){
        return "1.0.0";
    }*/

    @Bean
    public CommandLineRunner executar(){
        return args ->{
            System.out.println("Executou com método!!!");
        };
    }
}
