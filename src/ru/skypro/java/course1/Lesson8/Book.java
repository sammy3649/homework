package ru.skypro.java.course1.Lesson8;

public class Book {

    private final Author author;
    public int yearPublishing;
    private final String bookName;

    public Book (Author author, int yearPublishing, String bookName) {
        this.author = author;
        this.yearPublishing = yearPublishing;
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public String getBookName() {
        return bookName;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    @Override
    public String toString() {
        return "Book{" +
                "yearPublishing='" + yearPublishing + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'';
    }
}