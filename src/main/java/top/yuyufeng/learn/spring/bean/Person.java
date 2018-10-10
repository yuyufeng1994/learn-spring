package top.yuyufeng.learn.spring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author yuyufeng
 * @date 2018/10/10.
 */
public class Person implements InitializingBean {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person.afterPropertiesSet");
    }

    public void myInitMethod() {
        System.out.println("Person.initMethod");
    }
}
