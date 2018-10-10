package top.yuyufeng.learn.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author yuyufeng
 * @date 2018/7/17.
 */
public class Car {
    private int maxSpeed;
    private String brand;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
