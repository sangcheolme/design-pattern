package factory;

import factory.door.Door;
import factory.door.SamsungDoor;
import factory.motor.Motor;
import factory.motor.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}
