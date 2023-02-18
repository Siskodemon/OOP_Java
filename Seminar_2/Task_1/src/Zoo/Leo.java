package Zoo;

public class Leo extends Predator implements Runable{

    private int runSpeed = 30;
    public Leo(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "RRRRRRRRR!!!!!";
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }
}
