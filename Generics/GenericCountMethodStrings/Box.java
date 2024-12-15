package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T>myElementsList;

    public Box() {
        this.myElementsList = new ArrayList<>();
    }
    public void add(T element){
        myElementsList.add(element);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (T element:myElementsList){
            builder.append(element.getClass().getName()+": "+element).append(System.lineSeparator());
        }
        return builder.toString();
    }
    public int countElements(T element1){
        //The method should return the count of elements that are greater than the value of the given element.
        // Modify your Box class to support comparing by the value of the data stored
        int count=0;
        for (T currentElement:myElementsList){
            if(currentElement.compareTo(element1) > 0){
                count++;
            }
        }
        return count;
    }
}
