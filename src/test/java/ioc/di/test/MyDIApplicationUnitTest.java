package ioc.di.test;


import com.java.ioc.di.injector.ConvertInjector;
import com.java.ioc.di.injector.DIApp;
import com.java.ioc.di.injector.IntegerConvertInjector;
import com.java.ioc.di.service.Consumer;
import com.java.ioc.di.service.IntegerConvertService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationUnitTest {

    private ConvertInjector injector;

    @Before
    public void setUp(){
        injector = new IntegerConvertInjector(){

            public Consumer getConsumer() {
                return new DIApp(new IntegerConvertService()){
                    public void convert(Integer num){
                        System.out.println("Mock message");
                    }
                };
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.convertProcess(1);
    }

    @After
    public void after(){
        injector = null;
    }
}
