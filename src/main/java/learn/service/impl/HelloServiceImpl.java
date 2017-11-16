package learn.service.impl;

import learn.annotation.LogAnnotation;
import learn.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        int i = 1 / 0;
    }
}
