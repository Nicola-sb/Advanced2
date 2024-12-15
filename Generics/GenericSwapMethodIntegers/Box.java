package GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T>myElementsList;

    public Box() {
        this.myElementsList = new ArrayList<>();
    }

    public void add(T element){
        this.myElementsList.add(element);
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (T element:myElementsList){
            builder.append(element.getClass().getName()+": "+element).append(System.lineSeparator());
        }
        return builder.toString();
    }

    public void swap(int firstIndex,int secondIndex){
        T firstElement=myElementsList.get(firstIndex);
        T secondElement=myElementsList.get(secondIndex);

        myElementsList.set(firstIndex,secondElement);
        myElementsList.set(secondIndex,firstElement);
    }

//    public int countMethod(List<T>listElement,T element){
////The method should return the count of elements that are greater than the value of the given element.
//// Modify your Box class to support comparing by the value of the data stored
//
//    }


}
