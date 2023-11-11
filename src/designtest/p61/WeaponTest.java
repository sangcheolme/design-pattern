package designtest.p61;

public class WeaponTest {
    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.fight();
    }
}
