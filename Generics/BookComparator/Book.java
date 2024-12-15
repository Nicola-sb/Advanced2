package BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    //Create a class Book from UML diagram below:
    //-	title: String
    //-	year: int
    //-	authors: List<String>
    //-	setTitle(String)
    //-	setYear(String)
    //-	setAuthors(String…)
    //+	getTitle(): String
    //+	getYear(): int
    //+	getAuthors(): List<String>
    private String title;
    private int year;
    private List<String>authors;
    //You can use only one constructor. There can be no authors, one author, or many authors

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    //Create a class BookComparator from UML diagram below:
    //<<Comparator<Book>>>
    //BookComparator
    //+	compare(Book, Book): int
    //BookComparator has to compare two books by:
    //1.	Book title.
    //2.	Year of publishing a book



}
