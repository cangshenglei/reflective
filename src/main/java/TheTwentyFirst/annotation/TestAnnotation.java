package TheTwentyFirst.annotation;

import org.junit.Test;

import java.io.Serializable;
import java.util.Date;
//@SuppressWarnings({"deprecation","serial"})
@SuppressWarnings("all")
public class TestAnnotation implements Serializable {
    @Test
    public void test01(){
        Product product = new Product();
        product.method1();
        product.toString();
        new Date().toLocaleString();
    }
}
