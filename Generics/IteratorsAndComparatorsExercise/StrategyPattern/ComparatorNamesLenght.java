package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.Comparator;

public class ComparatorNamesLenght implements Comparator<Person> {
    //Create 2 Comparators for Person (classes that implement the Comparator<Person> interface).
    // The first comparator should compare people based on the length of their name as a first parameter,
    // if 2 people have a name with the same length, perform a case-insensitive compare based on the first letter of their name instead
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        if(firstPerson.getName().length()==secondPerson.getName().length()){
            char firstLetterFirstPerson=firstPerson.getName().toLowerCase().charAt(0);
            char firstLetterSecondPerson=secondPerson.getName().toLowerCase().charAt(0);
            return firstLetterFirstPerson-firstLetterSecondPerson;
        }
        return firstPerson.getName().length()-secondPerson.getName().length();
    }
}
