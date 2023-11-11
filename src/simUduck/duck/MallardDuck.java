package simUduck.duck;

import simUduck.FlyWithWings;
import simUduck.Quack;

/**
 * Quack
 * FlyWithWings
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck display");
    }
}
