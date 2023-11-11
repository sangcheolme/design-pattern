package designtest.p61;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    void fight() {
        weaponBehavior.useWeapon();
    }
}
