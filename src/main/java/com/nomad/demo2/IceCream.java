package com.nomad.demo2;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Dessert {
    public void getName() {
        System.out.println("icecream");
    }
}
