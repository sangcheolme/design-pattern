package simUduck.duck;

import simUduck.FlyWithWings;
import simUduck.Quack;

/**
 * Quack
 * FlyWithWings
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck display");
    }
}
