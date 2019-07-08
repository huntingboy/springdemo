package com.nomad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean("cd")
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
