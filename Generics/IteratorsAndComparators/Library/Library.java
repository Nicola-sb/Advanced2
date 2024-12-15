package IteratorsAndComparators.Library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {
    //Iterable e нещото,което държи елементите.В нашия случай това е Library,
    //която вътре в себе си държи книгите Book,които всъщност са елементите,които искаме да интерираме

    //Library име метод Iterator,които ни връща Итератор
    //Итератор е private class,който е nested

    private Book[] books;

    public Library(Book... books) {
        this.books =books;
    }

    @Override
    public Iterator<Book> iterator() {

        return new LibIterator();
    }
    //Create a class Library from UML diagram below:
    //<<Iterable<Book>>>
    //Library
    //-	books: Book[]
    //+	iterator(): Iterator<Book>

    //Create a nested class LibIterator from UML diagram below:
    //<<Iterator<Book>>>
    //LibIterator
    //-	counter: int
    //+	hasNext(): boolean
    //+	next(): Book
    public class LibIterator implements Iterator<Book>{
//        private int index;
        //Държи индекс и на този индекс ние ще връщаме елементите,всеки път,когато дадем next
        //next връща елемента и увеличава индекса
        private int index=0;
//        public LibIterator() {
//            this.index=0;
//        }

        @Override
        public boolean hasNext() {
            return this.index<books.length;//            return this.index<books.length;
        }

        @Override
        public Book next() {

            return books[index++];
        }
    }
}
