package BookComparator;

import java.util.Comparator;

public class BookComparatorLenght implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return Integer.compare(firstBook.getAuthors().size(),secondBook.getAuthors().size());
    }
}
