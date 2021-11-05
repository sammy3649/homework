package ru.skypro.java.course1.Lesson8;

public class Book {
    private final String name;
    public int yearPublishing;
    private final String bookName;

    public Book(String name, int yearPublishing, String bookName) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.bookName = bookName;
    }

    public String getName() {
        return this.name;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}