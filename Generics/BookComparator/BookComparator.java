package BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook,Book secondBook) {
        int result=firstBook.getTitle().compareTo(secondBook.getTitle());
        if(result==0){
            result=Integer.compare(firstBook.getYear(),secondBook.getYear());
        }
        return result;
    }

    //<<Comparator<Book>>>
    //BookComparator
    //+	compare(Book, Book): int
    //BookComparator has to compare two books by:
    //1.	Book title.
    //2.	Year of publishing a book
}
