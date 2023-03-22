import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    private Pokemon enemy;

    public WaterPokemon(String name, int Hp, int level, String food, String sound) {
        super(name, Hp, level, food, sound);
    }

    @Override
    public String getType() {
        return "water";
    }

    List<String> getAttacks() {
        return attacks;
    }

    private int getDamage(Pokemon enemy, int damage) {
        String type = enemy.getType();
        double effectiveness = 1; // stel effectiviteit in voor fire type aanval

        if (type.equals("fire")) {
            effectiveness = 2; // wateraanval is super effectief tegen fire type
            damage *= effectiveness;
        } else if (type.equals("electric")) {
            effectiveness = 0.5; // wateraanval is niet erg effectief electric water type
            damage *= effectiveness;
        } else if (type.equals("grass")) {
            effectiveness = 0.5; // wateraanval is niet erg effectief tegen grass type
            damage *= effectiveness;
        } else if (type.equals("water")) {
            effectiveness = 0; // wateraanval is niet effectief tegen water type
            damage *= effectiveness;
        }
        enemy.loseHp(damage); // verlaag hp van de vijand
        return damage;

    }

    void surf(Pokemon name, Pokemon enemy) {
        int damage = 14;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        int damage = 84;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        int damage = 17;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        int damage = 22;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }
}
