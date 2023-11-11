package observer;

public class CurrentConditionsDisplay implements Display {

    private String name = "currentConditionsDisplay";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("현재 조건");
        System.out.println("온도: " + temp + " 습도: " + humidity + " 압력: " + pressure);
        System.out.println();
    }
}
