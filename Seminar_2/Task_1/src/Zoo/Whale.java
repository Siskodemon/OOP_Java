package Zoo;

public class Whale extends Predator implements waterfowl{
    private int sspeed = 20;
    private int i_d = 1000;
    public Whale(String name) {
        super(name);
    }
    @Override
    public String say() {return "УУУУУУУУУУУУУУУУУУУУУУУУУУУУУ!!!";
    }

    @Override
    public int swimspeed() {
        return this.sspeed;
    }

    @Override
    public int immersion_depth() {
        return this.i_d;
    }
}
