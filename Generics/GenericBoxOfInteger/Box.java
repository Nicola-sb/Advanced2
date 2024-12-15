package GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{


    private List<T>myListInteger;

    public Box() {
        this.myListInteger = new ArrayList<>();
    }

    public void add(T element){
        this.myListInteger.add(element);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (T element:myListInteger){
            builder.append(element.getClass().getName()+": "+element).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
