import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("thunderpunch", "volttackle", "electroball", "thunder");

    public ElectricPokemon(String name, int hp, int level, String food, String sound) {
        super(name, hp, level, food, sound);

    }

    @Override
    public String getType() {
        return "electric";
    }

    List<String> getAttacks() {
        return attacks;
    }

    private int getDamage(Pokemon enemy, int damage) {
        String type = enemy.getType();
        double effectiveness = 1; // stel effectiviteit in voor grass type aanval

        if (type.equals("water")) {
            effectiveness = 2; // electricaanval is super effectief tegen water type
            damage *= effectiveness;
        } else if (type.equals("grass")) {
            effectiveness = 0.5; // electricaanval is niet erg effectief tegen grass type
            damage *= effectiveness;
        } else if (type.equals("fire")) {
            effectiveness = 0.5; // electricaanval is niet erg effectief tegen vuur type
            damage *= effectiveness;
        } else if (type.equals("electric")) {
            effectiveness = 0; // electricaanval is niet effectief tegen electric type
            damage *= effectiveness;
        }
        enemy.loseHp(damage); // verlaag hp van de vijand
        return damage;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        int damage = 9;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        int damage = 4;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        int damage = 42;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    void thunder(Pokemon name, Pokemon enemy) {
        int damage = 56;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }
}
