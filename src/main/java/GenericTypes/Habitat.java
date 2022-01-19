package GenericTypes;
import AbstractClasses.Animal;
import Interfaces.Moveable;

import java.util.ArrayList;
import java.util.List;

public class Habitat<T extends Moveable> {
    int habitatSize;
    List<Animal> animals;

    public Habitat(int habitatSize) {
        this.habitatSize = habitatSize;
        animals = new ArrayList<>(habitatSize);
    }

    public int getHabitatSize() {
        return habitatSize;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public String addAnimal(Animal animal) {
        String res;
        if (animal.getComfortableSpace() < this.habitatSize) {
           animals.add(animal);
           habitatSize =habitatSize - animal.getComfortableSpace();
            res = "There is  " + habitatSize + " places in ";
        }
        else {
            res = ("There is no space!!!");
        }
        return res;
    }
}
