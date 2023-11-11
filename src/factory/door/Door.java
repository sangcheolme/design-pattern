package factory.door;

public abstract class Door {

    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void open() {
        if (doorStatus == DoorStatus.OPENED) //이미 문이 열려 있으면 무시.
            return;

        doOpen(); //실제로 문을 여는 동작을 수행. 하위 클래스에서 오버라이드 됩니다.
        doorStatus = DoorStatus.OPENED;
    }
    protected abstract void doOpen(); //primitive or hook method

    public void close() {
        if (doorStatus == DoorStatus.CLOSED) //이미 문이 닫혀 있으면 무시.
            return;

        doClose(); //실제로 문을 닫는 동작을 수행. 하위클래스에서 오버라이드 됩니다.
        doorStatus = DoorStatus.CLOSED;
    }
    protected abstract void doClose(); //primitive or hook method
}
