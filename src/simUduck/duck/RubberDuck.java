package simUduck.duck;

import simUduck.FlyNoWay;
import simUduck.Squeak;

/**
 * Squeak
 * FlyNoWay
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck display");
    }
}
