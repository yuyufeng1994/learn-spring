package top.yuyufeng.learn.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import top.yuyufeng.learn.spring.bean.Person;

/**
 * @author yuyufeng
 * @date 2018/10/10.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().equals(Person.class)) {
            Person person = (Person) bean;
            person.setName(person.getName() + "bf");
            System.out.println("#MyBeanPostProcessor.Before " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().equals(Person.class)) {
            Person person = (Person) bean;
            person.setName(person.getName() + "af");
            System.out.println("#MyBeanPostProcessor. After  " + beanName);
        }
        return bean;
    }
}
