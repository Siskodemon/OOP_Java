package Zoo;

import Zoo.radio.SAyable;

public abstract class Animal implements SAyable {

    private String name;
    public abstract String say();

    protected Animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder srt = new StringBuilder();
        if (this instanceof Runable){
            srt.append("Скорость бегу -> "+((Runable) this).getSpeedRun());
        }
        if (this instanceof Flyable){
            srt.append("Скорость полёта -> "+((Flyable) this).getSpeedFlyable());
        }
        return String.format(srt + " , %s, ест %s, ",this.name, this.feed());
    }
}
