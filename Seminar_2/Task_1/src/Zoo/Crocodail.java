package Zoo;

public class Crocodail extends Predator implements Runable,waterfowl{

    private int runSpeed = 20;

    private int swimSpeed = 20;

    private int i_d = 20;
    public Crocodail(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "HHHHHRRRRRRR";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int swimspeed() {
        return this.swimSpeed;
    }

    @Override
    public int immersion_depth() {
        return this.i_d;
    }
}
