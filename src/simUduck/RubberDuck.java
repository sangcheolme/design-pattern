package simUduck;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("빽빽!!!");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck display");
    }
}
