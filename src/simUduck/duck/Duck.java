package simUduck.duck;

import simUduck.FlyBehavior;
import simUduck.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("수영!");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
}
