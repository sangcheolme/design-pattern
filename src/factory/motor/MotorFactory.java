package factory.motor;

import factory.VendorId;

public class MotorFactory { //Factory Method Pattern 사용
    //VendorId에 따라 LGMotor, HyundaiMotor를 생성
    public static Motor createMotor(VendorId vendorId) {
        Motor motor = null;
        switch (vendorId) {
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}
