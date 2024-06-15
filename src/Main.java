//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        System.out.println("Информация о Боссе");
        boss.setProtection("Нож");
        System.out.println("Урон Боса: " + boss.getDamage() + ".");
        System.out.println("Жизнь босса: " + boss.getHealth() + ".");
        System.out.println("Тип защиты: " + boss.getProtection() + ".");
        System.out.println("--------------");

        Hero[] heroes = createHeroes();
        for (Hero hero: heroes){
            System.out.println("жизнь героя: " + hero.getHealth());
            System.out.println("уроны героя: " + hero.getDamage());
            System.out.println("суппер способности героя: " + hero.getSuperPower());
        }

    }

    public static Hero[] createHeroes() {
        Hero doctor = new Hero(500, "реанимирование", 20);
        Hero mag = new Hero(400, "магия", 50);
        Hero dragon = new Hero("испепеление", 70);
        return new Hero[]{doctor, mag, dragon};


    }
}
