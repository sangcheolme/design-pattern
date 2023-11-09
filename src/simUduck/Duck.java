package simUduck;

public abstract class Duck {

    public void quack() {
        System.out.println("꽥꽥!!!");
    }

    public void swim() {
        System.out.println("수영!");
    }

    public void fly() {
        System.out.println("날기!");
    }

    public abstract void display();
}
