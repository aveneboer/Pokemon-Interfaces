import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("pyroBall", "inferno", "flameThrower", "fireLash");

    public FirePokemon(String name, int Hp, int level, String food, String sound) {
        super(name, Hp, level, food, sound);

    }

    @Override
    public String getType() {
        return "fire";
    }


    List<String> getAttacks() {
        return attacks;
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        int damage = 20; // stel schade in voor pyroBall
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }


    void inferno(Pokemon name, Pokemon enemy) {
        int damage = 30;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }


    void flameThrower(Pokemon name, Pokemon enemy) {
        int damage = 40;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

    private int getDamage(Pokemon enemy, int damage) {
        String type = enemy.getType();
        double effectiveness = 1; // stel effectiviteit in voor fire type aanval

        if (type.equals("grass")) {
            effectiveness = 2; // vuuraanval is super effectief tegen gras type
            damage *= effectiveness;
        } else if (type.equals("water")) {
            effectiveness = 0.5; // vuuraanval is niet erg effectief tegen water type
            damage *= effectiveness;
        } else if (type.equals("electric")) {
            effectiveness = 0.5; // vuuraanval is niet erg effectief tegen electric type
            damage *= effectiveness;
        } else if (type.equals("fire")) {
            effectiveness = 0; // vuuraanval is niet effectief tegen vuur type
            damage *= effectiveness;
        }
            enemy.loseHp(damage); // verlaag hp van de vijand
            return damage;

    }

    void fireLash(Pokemon name, Pokemon enemy) {
        int damage = 25;
        damage = getDamage(enemy, damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
    }

}
