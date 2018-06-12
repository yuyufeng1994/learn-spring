package top.yuyufeng.learn.spring.service.impl;

import top.yuyufeng.learn.spring.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author yuyufeng
 * @date 2017/11/14
 */
@Service("helloServiceImpl")
public class HelloServiceImpl implements HelloService {
    @Override
    public void hello(String words) {
        System.out.println(words);
    }
}
