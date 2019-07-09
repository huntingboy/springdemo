package com.nomad.demo2;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public NotePad getNotePad() {
        return new NotePad();
    }

    @Bean
    public StoreService storeService() {
        return new StoreService();
    }


}
