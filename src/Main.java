import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss Ragnarok = new Boss();
        Ragnarok.setDamage(500);
        Ragnarok.setHealth(1000);
        Ragnarok.setDefense(" Physical Defense");
        System.out.println("Boss HP: " + Ragnarok.getHealth() + " Boss Damage: " + Ragnarok.getHealth() +
                " Boss Defense: " + Ragnarok.getDefense());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Герой " + (i + 1) + createHeroes()[i]);
        }
    }


    public static Hero[] createHeroes() {
        Hero hero = new Hero(270, 40, " Ядовитые Колючки");
        Hero hero1 = new Hero(250, 37, " Иссушение");
        Hero hero2 = new Hero(200, 20, " Некромантия");
        Hero[] allHeroes = {hero, hero1, hero2};
        return allHeroes;

    }

}