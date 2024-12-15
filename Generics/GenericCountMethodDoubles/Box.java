package GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{

    public List<T>myElements;

    public Box() {
        this.myElements =new ArrayList<>();
    }
    public void add(T element){
        myElements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (T element:myElements){
            builder.append(element.getClass().getName()+": "+element).append(System.lineSeparator());
        }
        return builder.toString();
    }

    public int countMethod(T element){
        int count=0;
        for (T currentElement:myElements){
            if(currentElement.compareTo(element)==1){
                count++;
            }
        }
        return count;
    }



}
