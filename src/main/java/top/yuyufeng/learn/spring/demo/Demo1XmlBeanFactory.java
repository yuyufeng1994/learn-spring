package top.yuyufeng.learn.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import top.yuyufeng.learn.spring.bean.Car;
import top.yuyufeng.learn.spring.service.MyService;

/**
 * @author yuyufeng
 * @date 2018/6/14.
 */
public class Demo1XmlBeanFactory {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring/spring-demo1.xml");
        MyService myService = beanFactory.getBean(MyService.class);
//        MyService myService2 = beanFactory.getBean(MyService.class);
        myService.doSomeThing();

//        Car car = (Car) beanFactory.getBean("car");
//        System.out.println(car);
    }
}
