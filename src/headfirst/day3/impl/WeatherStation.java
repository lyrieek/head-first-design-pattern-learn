package headfirst.day3.impl;

import headfirst.day3.Subject;

/**
 * Created by thunder on 2017/4/1.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        CurrentConditionDisplay conditionDisplay1 = new CurrentConditionDisplay(null);

        /**
         * 将消息推送给订阅者
         */
        weatherData.setMeasurements(80,60,77);

        conditionDisplay.display();//该对象订阅了主题，所以可以展示数据
        conditionDisplay1.display();//该对象没订阅主题，不展示数据
        System.out.println("============================");

        weatherData.registerObserver(conditionDisplay1);//订阅主题
        weatherData.setMeasurements(80,60,77);
        conditionDisplay1.display();

        weatherData.removeObserver(conditionDisplay1);//取消订阅
        weatherData.setMeasurements(80,60,77);
        conditionDisplay1.display();
    }
}
