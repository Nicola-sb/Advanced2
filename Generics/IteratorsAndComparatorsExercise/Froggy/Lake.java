package IteratorsAndComparatorsExercise.Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{


    private List<Integer>numbers;

    public Lake(Integer...numbers) {
        this.numbers = List.of(numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }

    class Froggy implements Iterator<Integer>{
        private int index=0;
        private boolean firstRoundFinished=false;

        @Override
        public boolean hasNext() {
            return index<numbers.size();
        }

        @Override
        public Integer next() {
            //Create a Class Lake, it should implement the interface - Iterable. Inside the Lake
            Integer element=numbers.get(index);//Взимам си елемента
            index+=2;//Увеличам го с две(за да скачам само на четните индеските((започвам от 0+=2)))
            //Правя си проверка дали съм излезнал от масива и дали boolean променлива е false- тя става true ,когато приключа с първото скачане
            //Когато стане на true си правя индеска да ми бъде 1, за да мога да почна да си скачам на нечетните индески
            if(index >=numbers.size()&& !firstRoundFinished){
                index=1;
                firstRoundFinished=true;
            }
            return element;
        }
    }


}
