package ru.skypro.java.course1.lesson9;

import java.util.Objects;

public class Book {
    private final Author author;
    public int yearPublishing;
    private final String bookName;

    public Book(Author author, int yearPublishing, String bookName) {
        this.author = author;
        this.yearPublishing = yearPublishing;
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return this.author;
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

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", yearPublishing=" + yearPublishing +
                ", bookName='" + bookName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, yearPublishing, bookName);
    }
}