package Zoo;

public class Duck extends Herbivores implements Flyable,Runable,waterfowl{
private int flyspeed = 15;

private int High = 15;

private int Run = 15;

private int swimspeed = 15;

private int i_d = 5;
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Kry-Kry!!!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flyspeed;
    }

    @Override
    public int getHigh() {
        return this.High;
    }

    @Override
    public int getSpeedRun() {
        return this.Run;
    }

    @Override
    public int swimspeed() {
        return this.swimspeed;
    }

    @Override
    public int immersion_depth() {
        return this.i_d;
    }
}
