package CustromListSorter08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;
    //•	void add(T element)
    //•	T remove(int index)
    //•	boolean contains(T element)
    //•	void swap(int index, int index)
    //•	int countGreaterThan(T element)
    //•	T getMax()
    //•	T getMin()


    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }
    public T remove(int index){
       return this.elements.remove(index);
    }
    public boolean contains(T element){
        return this.elements.contains(element);
    }
    public int countGreatherThan(T element){
        int count=0;
        for (T currElement:elements){
            if(currElement.compareTo(element)>0){
                count++;
            }
        }
        return count;
    }
    public T getMax(){
        return this.elements.stream().max(Comparator.naturalOrder()).get();
    }
    public T getMin(){
        return this.elements.stream().min(Comparator.naturalOrder()).get();
    }
    public void print(){
        for (T element:elements){
            System.out.println(element);
        }
    }
    public void swap(int firstIndex,int secondIndex){
        T firstElement=elements.get(firstIndex);
        T secondElement=elements.get(secondIndex);

        elements.set(firstIndex,secondElement);
        elements.set(secondIndex,firstElement);
    }
    public  void sort(){
        //It should have a single static method sort() which can sort objects of type CustomList containing any type that can be compared.
        // Extend the command list to support one additional command Sort:
        //•	Sort - Sort the elements in the list in ascending order.
        this.elements.sort((e1,e2)->e1.compareTo(e2));
    }
}
