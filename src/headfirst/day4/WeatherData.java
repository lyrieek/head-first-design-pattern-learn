package headfirst.day4;

import java.util.Observable;

/**
 * 受观察对象和数据
 */
public class WeatherData extends Observable{

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    /**
     * 为主题提供数据来源，用于notify观察者list
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
