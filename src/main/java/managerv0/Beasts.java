package managerv0;

public class Beasts{
    private String name;
    private int ac;
    private int hp;
    private int speed;
    private Stats stats;

    public Beasts() {}

    public Beasts(String name, int ac, int hp, int speed, Stats stats) {
        this.name = name;
        this.ac = ac;
        this.hp = hp;
        this.speed = speed;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
