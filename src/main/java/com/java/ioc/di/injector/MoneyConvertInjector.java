package com.java.ioc.di.injector;

import com.java.ioc.di.service.Consumer;
import com.java.ioc.di.service.MoneyConvertService;

public class MoneyConvertInjector implements ConvertInjector {


    public Consumer getConsumer() {
        return new DIApp(new MoneyConvertService());
    }
}
