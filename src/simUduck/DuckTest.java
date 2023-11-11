package simUduck;

import simUduck.duck.Duck;
import simUduck.duck.MallardDuck;
import simUduck.duck.ModelDuck;

public class DuckTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
