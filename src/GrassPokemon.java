import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("leafStorm", "leaveBlade", "leechSeed", "solarBeam");

    public GrassPokemon(String name, int Hp, int level, String food, String sound) {
        super(name, Hp, level, food, sound);

    }

    @Override
    public String getType() {
        return "grass";
    }

    List<String> getAttacks() {
        return attacks;
    }

    private int getDamage(Pokemon enemy, int damage) {
        String type = enemy.getType();
        double effectiveness = 1; // stel effectiviteit in voor grass type aanval

        if (type.equals("electric")) {
            effectiveness = 2; // grassaanval is super effectief tegen electric type
            damage *= effectiveness;
        } else if (type.equals("fire")) {
            effectiveness = 0.5; // grassaanval is niet erg effectief tegen fire type
            damage *= effectiveness;
        } else if (type.equals("water")) {
            effectiveness = 0.5; // grassaanval is niet erg effectief tegen water type
            damage *= effectiveness;
        } else if (type.equals("grass")) {
            effectiveness = 0; // grassaanval is niet effectief tegen grass type
            damage *= effectiveness;
        }
        enemy.loseHp(damage); // verlaag hp van de vijand
        return damage;
    }
        public void leafStorm (Pokemon name, Pokemon enemy){
            int damage = 35;
            damage = getDamage(enemy, damage);
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
            System.out.println(enemy.getName() + " loses " + damage + " hp");
            System.out.println("Let's see if it has done any harm...." + "Enemy HP: " + enemy.getHp());
    }

        public void leaveBlade (Pokemon name, Pokemon enemy){
            int damage = 16;
            damage = getDamage(enemy, damage);
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveBlade");
            System.out.println(enemy.getName() + " loses " + damage + " hp");
            System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
        }

        public void leechSeed (Pokemon name, Pokemon enemy){
            int damage = 28;
            damage = getDamage(enemy, damage);
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
            System.out.println(enemy.getName() + " loses " + damage + " hp");
            System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
        }

        public void solarBeam (Pokemon name, Pokemon enemy){
            int damage = 69;
            damage = getDamage(enemy, damage);
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
            System.out.println(enemy.getName() + " loses " + damage + " hp");
            System.out.println("Let's see if it has done any harm...." + "Remaining HP after attack : " + enemy.getHp());
        }
    }
