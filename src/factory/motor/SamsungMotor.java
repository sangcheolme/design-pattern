package factory.motor;

public class SamsungMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Samsung motor");
    }
}
