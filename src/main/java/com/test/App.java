package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*1 - XML Configuration
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Vehicule obj = (Vehicule) ctx.getBean("car");
        obj.drive();
        
        Tyre t = (Tyre) ctx.getBean("tyre");
        System.out.println(t);*/
    	
    	
    	// 2 - Annotation Configuration
    	  ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

          Vehicule obj = (Vehicule) ctx.getBean(Car.class);
          obj.drive();
 
    }
}
