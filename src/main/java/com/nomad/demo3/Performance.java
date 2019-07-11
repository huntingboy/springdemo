package com.nomad.demo3;

public interface Performance {

    //切点
    //spring aop的切点只能限制为方法     Aspactj可以是构造器和字段
    public void perform();
}
