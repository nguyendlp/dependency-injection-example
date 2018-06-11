package com.java.ioc.di.injector;

import com.java.ioc.di.service.Consumer;
import com.java.ioc.di.service.IntegerConvertService;

public class IntegerConvertInjector implements ConvertInjector{

    public Consumer getConsumer() {
        return new DIApp(new IntegerConvertService());
    }
}
