package com.nomad.demo3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.nomad.demo3.Performance+",
    defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
