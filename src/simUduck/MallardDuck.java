package simUduck;

public class MallardDuck extends Duck implements Quackable, Flyable {

    @Override
    public void quack() {
        System.out.println("꽥꽥!!!");
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }

    @Override
    public void fly() {
        System.out.println("날기!");
    }
}
