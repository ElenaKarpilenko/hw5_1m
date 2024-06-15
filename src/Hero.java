public class Hero {
    private int health;
    private String superPower;
    private int damage;

    public Hero(int health, String superPower, int damage) {
        this.damage = damage;
        this.superPower = superPower;
        this.health = health;
    }
    public Hero(String superPower, int damage) {
        this.damage = damage;
        this.superPower = superPower;
    }
    public int getHealth() {
        return health;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getDamage() {
        return damage;
    }

}
