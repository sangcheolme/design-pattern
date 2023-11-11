package observer;

public class StatisticsDisplay implements Display {

    private String name = "statisticsDisplay";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("기상 통계");
        System.out.println("온도: " + temp + " 습도: " + humidity + " 압력: " + pressure);

        System.out.println();
    }
}
