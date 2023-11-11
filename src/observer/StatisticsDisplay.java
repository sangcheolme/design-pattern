package observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Display, DisplayElement {

    private float temperature;
    private List<Float> temperatures;
    private WeatherData weatherData;

    private float averageTemp;
    private float maxTemp;
    private float minTemp;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        this.temperature = temperature;
        this.averageTemp = temperatures.stream().reduce(Float::sum).get() / temperatures.size();
        this.minTemp = Collections.min(temperatures);
        this.maxTemp = Collections.max(temperatures);
        display();
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " + averageTemp + "/" +
                 maxTemp + "/" + minTemp);
    }
}
