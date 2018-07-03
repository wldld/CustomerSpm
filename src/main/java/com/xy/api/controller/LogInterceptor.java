package com.xy.api.controller;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogInterceptor {

    @Around("execution(* com.xy.api.controller..*(..))"
    )
    public Object process (ProceedingJoinPoint point) throws Throwable{

        Object returnValue = point.proceed();
        System.out.println("response:" + returnValue);

        return returnValue;
    }

}
