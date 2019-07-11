package com.nomad.demo3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* com.nomad.demo3.Performance.perform(..))")
    public void performance(){
    }

    /*@Before("execution(* com.nomad.demo3.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silence cell phones");
    }

    @Before("execution(* com.nomad.demo3.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(* com.nomad.demo3.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("execution(* com.nomad.demo3.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }*/

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silence cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    //环绕通知方法
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silence cell phones");
            System.out.println("Taking seats");
            jp.proceed(); //必须执行，否则阻塞
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }

    }
}
