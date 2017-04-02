package headfirst.day4;

import java.util.Observable;

/**
 * 气象站发布数据
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay= new CurrentConditionDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(70,80,90);
    }
}
