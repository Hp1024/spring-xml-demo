package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("MovieA",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("MovieB",Movie.class);
        movie2.display();
        System.out.println(movie1==movie2);
        Movie movie3=context.getBean("moviebean",Movie.class);
        movie3.display();

    }
}
