package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Supermarket implements Iterable<String>{

    private List<String>fruits;

    public Supermarket(String... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    @Override
    public Iterator<String> iterator() {
        return new shopAssistant();
    }
    private class shopAssistant implements Iterator<String>{
 //За да мога да имплементирам Итератора,трябва да имплементира метода hasNext и метода next;
        private int index=0;
        @Override
        public boolean hasNext() {
            return this.index<fruits.size();
        }

        @Override
        public String next() {

            return fruits.get(index++);
        }
    }
}
