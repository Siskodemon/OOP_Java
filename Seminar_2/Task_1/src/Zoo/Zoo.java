package Zoo;

import Zoo.radio.Radio;
import Zoo.radio.SAyable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    SAyable radio;
    List<Animal> animallist = new ArrayList<>();

    public void addAnimal(Animal animal){
        animallist.add(animal);
    }
    public Zoo(List<Animal> animals,SAyable sAyable){
        this.radio = sAyable;
        animallist.addAll(animals);
    }

    public void addAnimal(List<Animal> animals){
        animallist.addAll(animals);
    }

    public List<Animal> getAnimallist() {
        return animallist;
    }

    public List<SAyable> getSayable(){
        List<SAyable> sAyables = new ArrayList<>();
        for (Animal animal: animallist
             ) {sAyables.add(animal);

        }
        sAyables.add(this.radio);
        return sAyables;
    }

    public List<Runable> GetRunableList(){
        List<Runable> RunAbles = new ArrayList<>();
        for (Animal animal: animallist){
            if (animal instanceof Runable) RunAbles.add((Runable) animal);
        }
        return RunAbles;
    }

    public List<Flyable> GetFlyableList(){
        List<Flyable> flyAbles = new ArrayList<>();
        for (Animal animal: animallist){
            if (animal instanceof Flyable) flyAbles.add((Flyable) animal);
        }
        return flyAbles;
    }

    public List<waterfowl> GetSWMList(){
        List<waterfowl> swmAbles = new ArrayList<>();
        for (Animal animal: animallist){
            if (animal instanceof waterfowl) swmAbles.add((waterfowl) animal);
        }
        return swmAbles;
    }
    public  Animal getFlyChampions(){
        List<Flyable> Flyers = GetFlyableList();
        Flyable champion = Flyers.get(0);
        for (Flyable flyer: Flyers)
        {
            if (champion.getSpeedFlyable()<flyer.getSpeedFlyable()) {
                champion = flyer;
            }
        }
        return (Animal) champion;
    }

    public  Animal getRunChampions(){
        List<Runable> runners = GetRunableList();
        Runable champion = runners.get(0);
        for (Runable runner: runners)
        {
            if (champion.getSpeedRun()<runner.getSpeedRun()) {
                champion = runner;
            }
        }
        return (Animal) champion;
    }

    public  Animal getSwimChampions(){
        List<waterfowl> swimers = GetSWMList();
        waterfowl champion = swimers.get(0);
        for (waterfowl swimer: swimers)
        {
            if (champion.swimspeed()<swimer.swimspeed()) {
                champion = swimer;
            }
        }
        return (Animal) champion;
    }

}
