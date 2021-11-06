package ru.skypro.java.course1.Lesson8;

public class HomeWork8 {
    public static void main(String[] args) {
        Author white = new Author("Elvin", "White");
        Book charlotteWeb = new Book(white, 2002, "Charlotte Web");

        System.out.println(white);
        System.out.println(charlotteWeb);

        charlotteWeb.setYearPublishing(2012);
        System.out.println("newYearPublishing = " + charlotteWeb.yearPublishing);

        Author barry = new Author("James", "Barry");
        Book peterPen = new Book(barry, 1988, "Peter Pen");

        System.out.println(barry);
        System.out.println(peterPen);

        peterPen.setYearPublishing(1999);
        System.out.println("newYearPublishing = " + peterPen.getYearPublishing());
    }
}