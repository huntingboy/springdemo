package com.nomad.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan
public class FoodConfig {

    @Bean
//    @Primary
    public Dessert cookie() {
        return new Cookie();
    }

    @Bean
    public Dessert cake() {
        return new Cake();
    }

    @Bean
    public Dessert iceCream() {
        return new IceCream();
    }

    @Bean
    public Food food() {
        return new Food();
    }
}
