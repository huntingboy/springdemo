package com.nomad.demo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mycake") //限定符重命名，默认cake
public class Cake implements Dessert {
    public void getName() {
        System.out.println("cake");
    }
}
