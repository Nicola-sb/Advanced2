package IteratorsAndComparatorsExercise.FroggyAlone;

import IteratorsAndComparators.Library.Library;

import java.util.Iterator;
import java.util.List;

public class Frog implements Iterator<Frog> {

    //Create a Class Lake, it should implement the interface -
    // Iterable. Inside the Lake, create a Class - Frog and implement the interface Iterator. Keep in mind, you will be given integers only
    private List<Integer>numbers;


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Frog next() {
        return null;
    }
}
