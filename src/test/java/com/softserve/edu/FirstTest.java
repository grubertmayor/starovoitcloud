package com.softserve.edu;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class FirstTest {

    
    @Test

    public void checkOne() {

        System.out.println("FirstTest::checkOne()");
        System.out.println("THYMELEAF_CONNECTION = "+System.getenv("THYMELEAF_CONNECTION"));

        System.out.println("THYMELEAF_USER = "+System.getenv("THYMELEAF_USER"));
        System.out.println("THYMELEAF_PSW = "+System.getenv("THYMELEAF_PSW")); 

        System.out.println("MY_PASSWORD = "+System.getenv("MY_PASSWORD")); 
        System.out.println("JENKINS_VAR = "+System.getenv("JENKINS_VAR"));



        Assertions.assertEquals(System.getenv("THYMELEAF_USER"),"pmp312");
 
   }

}
