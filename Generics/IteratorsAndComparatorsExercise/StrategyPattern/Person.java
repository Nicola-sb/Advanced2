package IteratorsAndComparatorsExercise.StrategyPattern;

public class Person {
    //Create a class Person that holds name and age.
    // Create 2 Comparators for Person (classes that implement the Comparator<Person> interface).

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %d",name,age);
    }
}
