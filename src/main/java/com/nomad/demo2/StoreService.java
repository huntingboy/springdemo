package com.nomad.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

    private ShoppingCart shoppingCart;

    @Autowired
//    @Scope(value = WebApplicationContext.SCOPE_SESSION,
//    proxyMode = ScopedProxyMode.class)   //把基于ShoppingCart类拓展的代理注入到函数
    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }
}
