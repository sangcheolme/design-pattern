package factory.motor;

import factory.door.Door;

public abstract class Motor {
    private MotorStatus motorStatus;
    private Door door;

    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();

        if (motorStatus == MotorStatus.MOVING) return;

        door.close();
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void setDoor(Door door) {
        this.door = door;
    }
}
