import AnimalClasses.Fox;
import AnimalClasses.Tiger;
import AnimalClasses.Wolf;
import GenericTypes.Cage;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args)
    {
        Cage cage = new Cage(10);


        cage.addAnimal(new Tiger());
        cage.addAnimal(new Fox());
        cage.addAnimal(new Wolf());

        System.out.println(cage.getAnimals().toString());
    }
}
