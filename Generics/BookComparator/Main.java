package BookComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> myListWithBooks=new ArrayList<>();
        Book bookOne=new Book("Thing and go rich",1937,"Napoleon Hill");
        Book bookTwo=new Book("Monah with ferrari",1999,"Robin Sharma");
        myListWithBooks.add(bookOne);
        myListWithBooks.add(bookTwo);

        BookComparator myComparator=new BookComparator();
        myComparator.compare(bookOne,bookTwo);
        BookComparatorLenght myComparatorLenght=new BookComparatorLenght();
        myComparatorLenght.compare(bookOne,bookTwo);
        System.out.println(myComparatorLenght.compare(bookOne,bookTwo));
    }
}
