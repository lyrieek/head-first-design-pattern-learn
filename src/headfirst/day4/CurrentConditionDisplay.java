package headfirst.day4;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by thunder on 2017/4/2.
 */
public class CurrentConditionDisplay implements Observer , DisplayElement {

    /**
     * 传入受观察对象，并在该观察者初始化时完成订阅
     * @param observable
     */
    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder("temp:"+this.temp);
        sb.append("\nhumidity:"+this.humidity)
                .append("\npressure:"+this.pressure);
        System.out.println(sb.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        }

        display();
    }

    private Observable observable;
    private float temp;
    private float humidity;
    private float pressure;
}
