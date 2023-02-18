import java.util.List;


import Zoo.Animal;
import Zoo.radio.Radio;
import Zoo.radio.SAyable;
import Zoo.*;


public class Main {
    public static void main(String[] args) {
        List<Animal> animalsList = List.of(
                new Cow("Бурёнка"),
                new Crocodail("Гена"),
                new Leo("Леопольд"),
                new Goat("Яша"),
                new Duck("Дональд Дак"),
                new Whale("Моби Дик")
        );

        Zoo zoo = new Zoo(animalsList, new Radio());

        for (SAyable animal : zoo.getSayable()
        ) {
            System.out.println(animal.say());
        }
        System.out.println("=================================");
        for (Runable animal : zoo.GetRunableList()
        ) {
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedRun());
        }
        System.out.println("=================================");
        for (Flyable animal : zoo.GetFlyableList()
        ) {
            System.out.println(((Animal) animal).say());
            System.out.println(animal.getSpeedFlyable());
            System.out.println(animal.getHigh());
        }
        System.out.println("=================================");
        System.out.println(zoo.getFlyChampions());
        System.out.println("=================================");
        System.out.println(zoo.getRunChampions());
        System.out.println("=====Водоплавающие=====");
        for (waterfowl animal : zoo.GetSWMList()
        ) {
            System.out.println(((Animal) animal).say());
            System.out.println("Скорость плавания - "+animal.swimspeed());
            System.out.println("Глубина погружения - "+animal.immersion_depth());
            System.out.println("-----------------------------------");
        }
    }
}