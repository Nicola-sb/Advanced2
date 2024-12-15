package DefinndingClasses;

public class Dog {

    private String name;
    private int age;

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return String.format("My dog is %s",name);
    }
    public void bark(){
        System.out.println("LiverpoooooL Doggyy");
    }




}
