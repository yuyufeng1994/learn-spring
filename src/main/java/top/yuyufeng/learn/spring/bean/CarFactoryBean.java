package top.yuyufeng.learn.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author yuyufeng
 * @date 2018/7/17.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo;


    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand("BMW");
        car.setMaxSpeed(200);
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
