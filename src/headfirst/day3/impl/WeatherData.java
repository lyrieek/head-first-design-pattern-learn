package headfirst.day3.impl;

import headfirst.day3.Observer;
import headfirst.day3.Subject;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 天气数据类，继承订阅主题类
 */
public class WeatherData implements Subject {
    /**
     * 或者可以将list抽象到Subject之中
     * 因为impl了Subject类的对象是肯定需要一个list来存储观察者
     * 所以可以抽象至Subject之中
     */
    LinkedList<Observer> list = new LinkedList<>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        Iterator<Observer> it = list.iterator();
        while (it.hasNext()) {
            it.next().update(this.temp, this.humidity, this.pressure);
        }
    }

    /**
     * 为主题提供数据来源，用于notify观察者list
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public LinkedList<Observer> getList() {
        return list;
    }

    public void setList(LinkedList<Observer> list) {
        this.list = list;
    }
}
