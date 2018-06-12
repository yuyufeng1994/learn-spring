package top.yuyufeng.learn.spring.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author yuyufeng
 * @date 2017/11/14
 */
public class LogInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("#before");
        Object ret = invocation.proceed();
        System.out.println("#after");
        return ret;
    }
}
