package designtest.p61;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.println("Knight fight");
        weaponBehavior.useWeapon();
    }
}
