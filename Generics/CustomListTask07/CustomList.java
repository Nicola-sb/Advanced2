package CustomListTask07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T>elementsList;

    public CustomList() {
        this.elementsList = new ArrayList<>();
    }
    //•	void add(T element)
    //•	T remove(int index)
    //•	boolean contains(T element)
    //•	void swap(int index, int index)
    //•	int countGreaterThan(T element)
    //•	T getMax()
    //•	T getMin()
    public void add(T element){
        this.elementsList.add(element);
    }
    public T remove(int index){
       return this.elementsList.remove(index);
    }
    public boolean contains(T elemenet){
        return this.elementsList.contains(elemenet);
    }
    public void swap(int firstIndex,int secondIndex){
        T firstElement=elementsList.get(firstIndex);
        T secondElement=elementsList.get(secondIndex);

        elementsList.set(firstIndex,secondElement);
        elementsList.set(secondIndex,firstElement);
    }
    public int countGreaterThan(T element){
        int count=0;
        for (T currentElement:elementsList){
            if(currentElement.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }
    public T getMax(){
       return Collections.max(elementsList);
    }
    public T getMin(){
        return Collections.min(elementsList);
    }

    public void  print(){
        for (T element:elementsList){
            System.out.println(element);
        }
    }
}
