package factory.motor;

public class HyundaiMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai motor");
    }
}
