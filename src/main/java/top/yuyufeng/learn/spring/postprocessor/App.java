package top.yuyufeng.learn.spring.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.yuyufeng.learn.spring.bean.Person;

/**
 * @author yuyufeng
 * @date 2018/10/10.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-process.xml");

        Person p1 = (Person) ac.getBean("person1");
        System.out.println(p1);

        Person p2 = (Person) ac.getBean("person2");
        System.out.println(p2);
    }
}
