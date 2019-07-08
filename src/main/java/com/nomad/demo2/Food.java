package com.nomad.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Food {

    private Dessert dessert;

    @Autowired
    @Qualifier("mycake")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void getDessert(){
        dessert.getName();
    }
}
