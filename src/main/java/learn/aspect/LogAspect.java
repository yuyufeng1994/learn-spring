package learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author yuyufeng
 * @date 2017/11/14
 */
@Aspect
public class LogAspect {

    @Before("execution(* learn.service.impl.*.*(..))")
    public void methodBefore(JoinPoint point) {
        handleMethod(point);
        System.out.println("LogAspect.methodBefore");
    }
    @After("execution(* learn.service.impl.*.*(..))")
    public void methodAfter(JoinPoint point) {
        System.out.println("LogAspect.methodAfter");
    }


    @Around(value = "execution(* learn.service.impl.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        handleMethod(proceedingJoinPoint);
        //调用核心逻辑
        System.out.println("-----Start of aroundAdvice()-----");
        Object retVal = proceedingJoinPoint.proceed();
        System.out.println("-----End of aroundAdvice()------");
        return retVal;
    }


    @AfterThrowing(pointcut = "execution(* learn.service.impl.*.*(..))", throwing = "ex")
    public void doAfterThrowingTask(JoinPoint point,Exception ex) {
        System.out.println(ex.toString());
    }


    /**
     * 获取方法名称
     *
     * @param joinPoint
     * @return
     * @throws Exception
     */
    public static String handleMethod(JoinPoint joinPoint){
        Class<?> clazz = joinPoint.getTarget().getClass();
        String name = joinPoint.getSignature().getName();
        Object[] parameterTypes = joinPoint.getArgs();
        System.out.println(name);
        for (Object parameterType : parameterTypes) {
            System.out.println("# "+parameterType);
        }
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("* "+method.getName());
        }
        return "";
    }
}
