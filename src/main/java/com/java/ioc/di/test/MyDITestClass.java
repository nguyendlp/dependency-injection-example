package com.java.ioc.di.test;

import com.java.ioc.di.injector.ConvertInjector;
import com.java.ioc.di.injector.IntegerConvertInjector;
import com.java.ioc.di.injector.MoneyConvertInjector;
import com.java.ioc.di.service.Consumer;

public class MyDITestClass {

    public static void main(String[] args) {
        Integer num = 1;

        ConvertInjector injector = null;
        Consumer app = null;

        // Integer convert
        injector = new IntegerConvertInjector();
        app = injector.getConsumer();
        app.convertProcess(num);

        // Money convert
        injector = new MoneyConvertInjector();
        app = injector.getConsumer();
        app.convertProcess(num);
    }
}
