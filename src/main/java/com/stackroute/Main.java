package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context1 =new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context1.getBean("moviebean",Movie.class);
        movie1.display1("actorbean1");
        movie1.display2("actorbean2");
    }
}
