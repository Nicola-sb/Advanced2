package IteratorsAndComparators.ComaparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String>authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
//Expand Book by implementing Comparable<Book>.
//The book has to be compared by title. When the title is equal, compare them by year.
//Expand Book from UML diagram below:

    @Override
    public int compareTo(Book otherBook) {
        int result=this.getTitle().compareTo(otherBook.getTitle());
        if(result==0){
            result=Integer.compare(this.getYear(),otherBook.getYear());
        }
        return result;
    }
}

//if(this.getTitle().compareTo(otherBook.getTitle())==0){
//            return Integer.compare(this.getYear(),otherBook.getYear());
//        }
