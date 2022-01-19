package AnimalClasses;

import AbstractClasses.Bird;
import Interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public int getComfortableSpace() {
        return 1;
    }
    @Override
    public String toString() {
        return "Sparrow";
    }
}
