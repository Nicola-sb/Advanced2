package IteratorsAndComparatorsExercise.ComparingObject;

public class Person implements Comparable<Person>{
    //. Create a Class Person. Each person should have a name, age, and town.
    // You should implement the interface - Comparable and try to override the compareTo method.
    // When you compare two people, first you should compare their names, after that - their age and last but not at least - compare their town.

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person otherPerson) {
     int result=this.getName().compareTo(otherPerson.getName());
     if(result==0){
         result=Integer.compare(this.getAge(),otherPerson.getAge());
         if(result==0){
             result=this.getTown().compareTo(otherPerson.getTown());
         }
     }
     return result;
    }
}
