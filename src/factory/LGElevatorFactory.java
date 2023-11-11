package factory;

import factory.door.Door;
import factory.door.LGDoor;
import factory.motor.LGMotor;
import factory.motor.Motor;

public class LGElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
