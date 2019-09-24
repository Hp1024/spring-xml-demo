package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String ab;

    public void customInit(){
        System.out.println("init method from bean definition is called");
    }
    public void customDestroy(){
        System.out.println("destroy method from bean definition is called");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean interface method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean interface method is called");
    }
}
