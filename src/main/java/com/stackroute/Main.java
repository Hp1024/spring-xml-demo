package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
//        using Application context
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("moviebean",Movie.class);
        System.out.println("using application context");
        movie1.display();
//        using BeanFactory
        ClassPathResource path=new ClassPathResource("beans.xml");
        XmlBeanFactory beanfactory= new XmlBeanFactory(path);
        Movie movie2=beanfactory.getBean("moviebean",Movie.class);
        System.out.println("using bean factory");
        movie2.display();
//        using BeanRegistry and BeanReader
//        DefaultListableBeanFactory registry=new DefaultListableBeanFactory(); //implements bean definition registry interface
//        GenericBeanDefinition beandefinition=new GenericBeanDefinition();
//        beandefinition.setBeanClass(Movie.class);
//        registry.registerBeanDefinition("moviebean",beandefinition);
//        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(registry); //implements bean definition reader
//        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        




    }
}
