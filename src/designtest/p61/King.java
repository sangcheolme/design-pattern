package designtest.p61;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    void fight() {
        System.out.println("King fight");
        weaponBehavior.useWeapon();
    }
}
