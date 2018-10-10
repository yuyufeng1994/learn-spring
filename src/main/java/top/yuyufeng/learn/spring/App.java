package top.yuyufeng.learn.spring;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author yuyufeng
 * @date 2018/6/12.
 */
public class App {
    public static void main(String[] args) throws IOException {
//        Class.getResource("") 获取的是相对于当前类的相对路径
//        Class.getResource("／")    获取的是classpath的根路径
//        ClassLoader.getResource("")   获取的是classpath的根路径
        Resource resource = new ClassPathResource("/hello.txt");
        InputStream is = resource.getInputStream();
    }
}
