package com.stackroute;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context1 =new ClassPathXmlApplicationContext("beans.xml");
        context1.registerShutdownHook();
    }
}
