package LibraryAlone;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    //Когато имаме Implements въртре в къдравитв скоби на Iterabele трябва да сложим това,което ще итерираме
    //И за да може да итерираме ми трябва итератор метода public Iterator<Book> iterator(){
    //        return new LibIterator();
    //    }
    //-	books: Book[]
    //+	iterator(): Iterator<Book>
    //Create a nested class LibIterator from UML diagram below:
    //<<Iterator<Book>>>
    //LibIterator
    //-	counter: int
    //+	hasNext(): boolean
    //+	next(): Book

    private Book[]books;

    public Library(Book[] books) {
        this.books = books;
    }
    public Iterator<Book> iterator(){
        return new LibIterator();
    }
    //Create a nested class LibIterator from UML diagram below:
    //<<Iterator<Book>>>
    //LibIterator
    //-	counter: int
    //+	hasNext(): boolean
    //+	next(): Book
    public class LibIterator implements Iterator<Book>{
        int counter=0;


        @Override
        public boolean hasNext() {
            return this.counter<books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }

}
