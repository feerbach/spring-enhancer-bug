package com.example.demo;

import org.springframework.beans.factory.InitializingBean;

public class OtherBean implements InitializingBean {

    private SomeFactory someFactory;

    public void setSomeFactory(SomeFactory someFactory) {
        this.someFactory = someFactory;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println(someFactory.getBean().getMessage());
    }
}
