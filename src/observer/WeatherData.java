package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float humidity;
    private float pressure;

    private List<Display> displays;

    public WeatherData() {
        displays = new ArrayList<>();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Display display) {
        displays.add(display);
    }

    @Override
    public void removeObserver(Display display) {
        displays.remove(display);
    }

    @Override
    public void notifyObservers() {
        for (Display d : displays) {
            d.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
