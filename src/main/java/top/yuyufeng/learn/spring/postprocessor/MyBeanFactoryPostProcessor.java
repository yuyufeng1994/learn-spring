package top.yuyufeng.learn.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import top.yuyufeng.learn.spring.bean.Person;


/**
 * @author yuyufeng
 * @date 2018/10/10.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
            if (bd.getBeanClassName().equals(Person.class.getName())) {
                System.out.println("#ProcessBeanFactory " + beanName);
                MutablePropertyValues mp = bd.getPropertyValues();
                mp.add("age", 0);
            }
        }
    }
}
