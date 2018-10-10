package top.yuyufeng.learn.spring.service;

import org.springframework.stereotype.Component;

/**
 * @author yuyufeng
 * @date 2018/6/14.
 */
@Component
public class MyService2 {
    private String myParam = "testMyParam2";

    public String getMyParam() {
        return myParam;
    }

    public void setMyParam(String myParam) {
        this.myParam = myParam;
    }

    public void doSomeThing() {
        System.out.println("MyService.doSomeThing2: " + myParam);
    }
}
