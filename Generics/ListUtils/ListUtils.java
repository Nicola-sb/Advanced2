package ListUtils;

import java.util.Collections;
import java.util.List;

public class ListUtils {//50 от 100 точки?!?!

    public static <T extends Comparable<T>> T getmax(List<T>list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
           return Collections.max(list);
    }
    public static <T extends Comparable<T>> T getMin(List<T>list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.min(list);
        //===->>>
//        T currentMin=listT.get(0);//Взимаме първият елемент от нашият списък;Знаем,че списъкът не е празен
//        for(int i=1 ;i<listT.size() ;i++){//Започваме да интерираме от първия елемент
//            T currentElement=listT.get(i);//Изкарвам си текущия елемент
//            if(currentMin.compareTo(currentElement)>0){
//                currentMin=currentElement;
//            }
//        }
//        return currentMin;
    }
}
