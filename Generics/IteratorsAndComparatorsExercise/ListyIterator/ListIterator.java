package IteratorsAndComparatorsExercise.ListyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<ListIterator>{
    //Create a class ListyIterator, it should receive the collection of Strings which it will iterate, through its constructor.
    // You should store the elements in a List
    private List<String> elements;
    private int index;

    public ListIterator(List<String> elements) {
        this.elements = elements;
        if(elements.isEmpty()){
            index=-1;
        }else{
            index=0;
        }
    }
    //•	Move - should move an internal index position to the next index in the list,
    // the method should return true if it successfully moved and false if there is no next index

    public boolean move(){
        //true-> ако има следващ индеск
        //false-> ако няма следващ индекс
//        return this.index<elements.size()-1;
        if(this.index<elements.size()-1){
            index++;
            return true;
        }
        return false;
    }
    //•	HasNext - should return true if there is a next index and false if the index is already at the last element of the list
    public boolean hasNext(){//Целта на метода е да проверя дали имам друг индекс след моя
        //Ще ми върне true,ако моя индеск не е последен
        //и ако е последния индекс ми връща false
        return this.index<elements.size()-1;
    }
    //•	Print - should print the element at the current internal index,
    // calling Print on a collection without elements should throw an appropriate exception with the message "Invalid Operation!".
    public void print() throws Exception {
        if(elements.isEmpty()){
            throw new Exception();
        }else{
            System.out.println(elements.get(index));
        }
    }
    //. Add a new method to the class PrintAll(), the method should foreach the collection and print all elements on a single line separated by a space.
    public void printAll(){
        for (String element:elements){
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<ListIterator> iterator() {
        return null;
    }

}
