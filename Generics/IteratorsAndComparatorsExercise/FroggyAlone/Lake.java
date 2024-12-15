package IteratorsAndComparatorsExercise.FroggyAlone;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    //Create a Class Lake, it should implement the interface -
    // Iterable. Inside the Lake, create a Class - Frog and implement the interface Iterator. Keep in mind, you will be given integers only
    private List<Integer> numbers;

    public Lake(Integer... numbers) {
        this.numbers = List.of(numbers);
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }

    class Froggy implements Iterator<Integer>{
           int index=0;
           boolean isFirstRoundFinished=false;
        @Override
        public boolean hasNext() {
            return index<numbers.size();
        }

        @Override
        public Integer next() {
            Integer element=numbers.get(index);
            index+=2;
            if(index>=numbers.size() && !isFirstRoundFinished){
                index=1;
                isFirstRoundFinished=true;
            }
            return element;
        }
    }
}
