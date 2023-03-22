import java.util.List;

public abstract class Pokemon {
    String name;
    int Hp;
    int level;
    String food;
    String sound;


    public Pokemon(String name, int Hp, int level, String food, String sound) {
        this.name = name;
        this.Hp = Hp;
        this.level = level;
        this.food = food;
        this.sound = sound;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract String getType();

    public void loseHp(int damage) {
        this.Hp -= damage;
        if (this.Hp <= 0) {
            System.out.println(this.name + " fainted");
        }
    }
}
