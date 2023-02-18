package Zoo;

public class Cow extends  Herbivores implements Flyable{
    private int flyspeed = 15;

    private int High = 5;
    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Muu!!!";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flyspeed;
    }

    @Override
    public int getHigh() {
        return this.High;
    }
}
