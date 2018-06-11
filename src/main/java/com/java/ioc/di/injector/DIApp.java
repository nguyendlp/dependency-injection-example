package com.java.ioc.di.injector;

import com.java.ioc.di.service.Consumer;
import com.java.ioc.di.service.ConvertService;

public class DIApp implements Consumer {

    private ConvertService convertService;

    public DIApp(ConvertService convertService){
        this.convertService = convertService;
    }

    public void convertProcess(Integer num) {
        convertService.convert(num);
    }
}
