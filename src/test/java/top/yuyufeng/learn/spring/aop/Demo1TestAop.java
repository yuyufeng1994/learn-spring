package top.yuyufeng.learn.spring.aop;

import top.yuyufeng.learn.spring.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuyufeng
 * @date 2017/11/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-aop.xml"})
public class Demo1TestAop {
    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        System.out.println("Demo1.test");
    }

    @Test
    public void testHelloService() {
//        AnnotationUtils.
        try{
            helloService.hello("hello 你好~");
        }catch (Exception e){
            System.out.println("出现异常");
        }
    }

}
