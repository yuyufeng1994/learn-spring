package top.yuyufeng.learn.spring.service;

/**
 * @author yuyufeng
 * @date 2018/6/14.
 */
public class MyService {
    private String myParam = "testMyParam";

    public String getMyParam() {
        return myParam;
    }

    public void setMyParam(String myParam) {
        this.myParam = myParam;
    }

    public void doSomeThing() {
        System.out.println("MyService.doSomeThing: " + myParam);
    }
}
