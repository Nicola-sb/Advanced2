package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class BoxAlone <T>{
    private List<T> elements;

    public BoxAlone(List<T> elements) {
        this.elements = new ArrayList<>();
    }

    public void add(T element){//life in a box
        this.elements.add(element);
        //В листа на 0 индекс -- life in a box
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        for (T element: elements){
            builder.append(elements.getClass().getName()+": "+element).append("n/a");
        }
        return builder.toString();
    }
}
