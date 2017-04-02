package headfirst.day4;

import java.util.Observable;
import java.util.Observer;

/**
 * 另一个订阅类
 */
public class ForecastDisplay implements Observer , DisplayElement {

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder("\npressure:"+this.pressure);
        System.out.println(sb.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.pressure = weatherData.getPressure();
        }

        display();
    }
    private Observable observable;
    private float pressure;
}
