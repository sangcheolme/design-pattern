package factory;

import factory.door.Door;
import factory.motor.Direction;
import factory.motor.Motor;

public class Client {
    public static void main(String[] args) {
        ElevatorFactory factory = null;
        String vendorName = "Samsung"; // 인자 값에 따라 LG 또는 Hyundai 팩토리 생성

        if(vendorName.equalsIgnoreCase("LG")) factory = new LGElevatorFactory();
        else if(vendorName.equalsIgnoreCase("Samsung")) factory = new SamsungElevatorFactory();
        else factory = new HyundaiElevatorFactory();

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
