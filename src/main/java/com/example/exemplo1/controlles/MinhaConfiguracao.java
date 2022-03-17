package com.example.exemplo1.controlles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguracao {
    @Bean
    public String nomeAplicacao()
    {
        return "Aula 2 - Teste";
    }
    @Bean
    public String versaoAplicacao()
    {
        return "1.0.0";
    }
}
