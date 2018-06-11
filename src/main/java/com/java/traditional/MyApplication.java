package com.java.traditional;

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

public class MyApplication {

    // Look, In traditional way, MyApplication class is responsible to initialize IntegerConvert DependencyInjection and then use it.
    // This leads to hard-cored dependency.
    // If we want to switch to some other advanced convert DependencyInjection in future, it will require code changes in this class.
    // It makes the application hard to scale...
    // Testing the application also will be difficult since this application is directly creating the IntegerConvertService
    // instance. There is no way we can mock these object in main class.
    // Got it?

    private IntegerConvertService service = new IntegerConvertService();

    public void convertProcess(Integer num){
        //code logic to validate input, etc
        service.convert(num);
    }
}