package ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> myList=new ArrayList<>();
        myList.add(12);
        myList.add(14);
        myList.add(33);
        myList.add(66);
        myList.add(-125);
        System.out.println(ListUtils.getmax(myList));
        System.out.println(ListUtils.getMin(myList));
    }
}
