package factory;

import factory.door.Door;
import factory.door.HyundaiDoor;
import factory.motor.HyundaiMotor;
import factory.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
