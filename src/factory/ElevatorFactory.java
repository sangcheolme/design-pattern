package factory;

import factory.door.Door;
import factory.motor.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
