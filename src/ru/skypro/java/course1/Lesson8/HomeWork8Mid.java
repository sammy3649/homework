package ru.skypro.java.course1.Lesson8;

public class HomeWork8Mid {
    public static void main(String[] args) {
        Author braun = new Author("Dan", "Braun");
        Book[] books = new Book[8];

        addBook(books, new Book(braun, 1999, "book1"));
        addBook(books, new Book(braun, 2000, "book2"));
        addBook(books, new Book(braun, 2001, "book3"));
        addBook(books, new Book(braun, 2002, "book4"));
        addBook(books, new Book(braun, 2003, "book5"));
        addBook(books, new Book(braun, 2004, "book6"));

        for (Book book : books) {
            if (book != null) {
                printBook(book);
            }
        }
    }

    private static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    private static void printBook(Book book) {
        System.out.println(String.join(": ", book.getAuthor().getName() + " "
                + book.getAuthor().getSurname(), book.getBookName(), String.valueOf(book.getYearPublishing())));
    }

}