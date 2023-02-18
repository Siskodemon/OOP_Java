package Zoo;

public class Goat extends Herbivores implements Runable {
    private int runspeed = 20;

    public Goat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Beeee!!!!";
    }

    @Override
    public int getSpeedRun() {
        return this.runspeed;
    }
}
