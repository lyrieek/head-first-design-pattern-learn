package headfirst.day3.impl;

import headfirst.day3.DisplayElement;
import headfirst.day3.Observer;
import headfirst.day3.Subject;

/**
 * 一个订阅了天气数据，并且将之展示的观察者
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;

    /**
     * 初始化观察者时,选择是否订阅天气数据
     */
    private Subject weatherData=null;

    public CurrentConditionDisplay(Subject subject) {
        if (subject != null) {
            this.weatherData = subject;
            subject.registerObserver(this);
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder("this object");
        sb.append(this.weatherData != null ?" is ":" is not ");
        sb.append("register from WeatherData is \ntemp:" + this.temp +
                "\nhumidity:" + this.humidity + "\npressure:" + this.pressure);
        System.out.println(sb.toString());
    }
}
