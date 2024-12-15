package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    //Create a generic class Box that can store any type.
    // Override the toString() method to print the type and the value of the stored data in the format "{class full name}: {value}".

    private List<T>elements;

    public Box() {
        this.elements=new ArrayList<>();
    }

    public void add(T element){
        //Целта на метода add е да приема някакъв елементи и да го добавя към списък на елементите към кутията
        this.elements.add(element);
    }

    @Override
    public String toString() {
        //Override the toString() method to print the type and the value of the stored data in the format "{class full name}: {value}
        StringBuilder builder=new StringBuilder();
        for (T element:elements){
            builder.append(element.getClass().getName()+": "+element).append(System.lineSeparator());
        }
         return builder.toString();
    }
}
