package com.java.ioc.di.service;

public class IntegerConvertService implements ConvertService {

    public void convert(Integer num) {
        System.out.println("integer convert to presentation text");
    }
}
