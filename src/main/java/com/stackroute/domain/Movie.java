package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware , ApplicationContextAware , BeanNameAware {
    private Actor actor;
    private BeanFactory beanfactory;
    private ApplicationContext context;
    public void display1(String beanname){
        this.actor=beanfactory.getBean(beanname,Actor.class);
        System.out.println(this.actor.getName()+","+this.actor.getGender()+","+this.actor.getAge());
    }
    public void display2(String beanname){
        this.actor=context.getBean(beanname,Actor.class);
        System.out.println(this.actor.getName()+","+this.actor.getGender()+","+this.actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanfactory=beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);
    }
}
