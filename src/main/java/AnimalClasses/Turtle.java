package AnimalClasses;

import AbstractClasses.Animal;
import Interfaces.Swimable;
import Interfaces.Walkable;

public class Turtle extends Animal implements Swimable, Walkable {
    @Override
    public int getComfortableSpace() {
        return 1;
    }
    @Override
    public String toString() {
        return "Turtle";
    }
}
