package GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    //Create a generic method that receives a list containing any type of data and swaps the elements at two given indexes.

    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(element.getClass().getName() + ": " + element).append(System.lineSeparator());
        }
          return builder.toString();
    }

    ////Create a generic method that receives a list containing any type of data and swaps the elements at two given indexes.
    public void swap(int firstIndex,int secondIndex){
        T firstIndexElement=elements.get(firstIndex);
        T secondIndexElement=elements.get(secondIndex);

        elements.set(firstIndex,secondIndexElement);
        elements.set(secondIndex,firstIndexElement);
    }
}
