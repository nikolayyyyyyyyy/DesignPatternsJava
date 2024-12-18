package Lab3.ex3;

import java.util.Objects;

public class Dragon {
    private final String name;
    private final double damage;
    private final double health;
    private final double armour;

    public Dragon(String name, double damage, double health, double armour) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public double getArmour() {
        return armour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return Objects.equals(name, dragon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
