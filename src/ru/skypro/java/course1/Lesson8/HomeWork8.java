package ru.skypro.java.course1.Lesson8;

public class HomeWork8 {
    public static void main(String[] args) {
        Author white = new Author("Elvin", "White");
        Book charlotteWeb = new Book("Elvin", 2002, "Charlotte Web");
        System.out.println("white.getName + white.getSurname = " + white.getName() + " " + white.getSurname());
        System.out.println("charlotteWeb.getBookName + charlotteWeb.getYearPublishing + charlotteWeb.getName = "
                + charlotteWeb.getBookName() + "/" + charlotteWeb.getYearPublishing() + "/" + charlotteWeb.getName());
        charlotteWeb.setYearPublishing(2012);
        System.out.println("charlotteWeb.yearPublishing = " + charlotteWeb.yearPublishing);
        Author barry = new Author("James", "Barry");
        Book peterPen = new Book("James", 1988, "Peter Pen");
        System.out.println("barry.getSurname + barry.getName = " + barry.getSurname() + "/" + barry.getName());
        System.out.println("peterPen.yearPublishing + peterPen.getName + peterPen.getBookName  = "
                + peterPen.yearPublishing + "/" + peterPen.getName() + "/" + peterPen.getBookName());
        peterPen.setYearPublishing(1999);
        System.out.println("peterPen.getYearPublishing = " + peterPen.getYearPublishing());
    }
}