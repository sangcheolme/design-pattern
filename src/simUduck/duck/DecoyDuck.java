package simUduck.duck;

import simUduck.FlyNoWay;
import simUduck.MuteQuack;

/**
 * MuteQuack
 * FlyNoWay
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck display");
    }
}
