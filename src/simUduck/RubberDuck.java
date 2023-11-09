package simUduck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("빽빽!!!");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck display");
    }

    @Override
    public void fly() {
    }
}
