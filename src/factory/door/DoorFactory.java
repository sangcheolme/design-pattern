package factory.door;

import factory.VendorId;

public class DoorFactory {
    public static Door createDoor(VendorId vendorId) {
        Door door = null;
        switch (vendorId) {
            case LG:
                door = new LGDoor();
                break;
            case HYUNDAI:
                door = new HyundaiDoor();
                break;
            case SAMSUNG:
                door = new SamsungDoor();
                break;
            //...
        }
        return door;
    }
}
