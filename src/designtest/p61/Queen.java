package designtest.p61;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    void fight() {
        System.out.println("fight");
        weaponBehavior.useWeapon();
    }
}
