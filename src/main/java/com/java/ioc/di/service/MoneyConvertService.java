package com.java.ioc.di.service;

//
// Hey Hey
//
// You may think you know what the following code does.
// But you don't. Trust me.
// Fiddle with it, and you'll spend many a sleepless
// night cursing the moment you thought you'd be clever
// enough to "optimize" the code below.
// Now close this file and go play with something else.
//

public class MoneyConvertService implements ConvertService{

    public void convert(Integer num) {
        System.out.println("convert money number to presentation text");
    }
}
