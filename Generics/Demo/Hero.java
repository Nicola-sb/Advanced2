package Demo;

import java.util.Comparator;

public class Hero implements Comparable<Hero> {
    private String name;
    private int age;

    public Hero(String name, int age) {
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
    public int compareTo(Hero otherHero) {
        int result=this.getName().compareTo(otherHero.getName());
        if(result==0){
            result=Integer.compare(this.getAge(),otherHero.getAge());
        }
        return result;
    }
}
