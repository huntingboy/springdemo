package com.nomad.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //解决歧义bean装配
public class Cookie implements Dessert {
    public void getName() {
        System.out.println("cookie");
    }
}
