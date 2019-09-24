package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) throws UnsatisfiedDependencyException
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("moviebean1",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("moviebean2",Movie.class);
        movie2.display();

    }
}
