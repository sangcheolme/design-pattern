package simUduck;

import simUduck.duck.Duck;
import simUduck.duck.MallardDuck;
import simUduck.duck.RubberDuck;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
