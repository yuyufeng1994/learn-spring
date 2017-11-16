package learn.annotation;

import java.lang.annotation.*;

/**
 * @author yuyufeng
 * @date 2017/11/14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
    String value() default "";
}
