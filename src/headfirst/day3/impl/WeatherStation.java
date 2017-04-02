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

        conditionDisplay.display();
        conditionDisplay1.display();
    }
}
