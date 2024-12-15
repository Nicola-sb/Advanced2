package ClassesExercise.FirstTask.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private List<Children> children;
    private List<Parents> parents;
    private List<Pokemon> pokemons;
    private Car car;
    private Company company;

    public Person(){
        this.children=new ArrayList<>();
        this.parents=new ArrayList<>();
        this.pokemons=new ArrayList<>();
        this.car=null;
        this.company=null;
    }

    public Person(List<Children> children, List<Parents> parents, List<Pokemon> pokemons, Car car, Company company) {
        this.children = children;
        this.parents = parents;
        this.pokemons = pokemons;
        this.car = car;
        this.company = company;
    }

    public void setCompany(Company company) {
        this.company=company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public List<Children> getChildred() {
        return this.children;
    }

    public void setCar(Car car) {
        this.car=car;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Company:").append("\n");
        if(company !=null){
            builder.append(company);
        }
        builder.append("Car:").append("\n");
        if(car !=null){
            builder.append(car).append("\n");
        }
        builder.append("Pokemon:").append("\n");
        if(pokemons!=null){
            for (Pokemon pokemon:pokemons){
                builder.append(pokemon).append("\n");
            }
        }
        builder.append("Parents:").append("\n");
        if(parents!=null){
            for (Parents parent:parents){
                builder.append(parent).append("\n");
            }
        }
        builder.append("Children:").append("\n");
        if(children!=null){
            for (Children children1:children){
                builder.append(children1).append("\n");
            }
        }
        return builder.toString();
    }
}
