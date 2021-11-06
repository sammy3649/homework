package ru.skypro.java.course1.lesson9;

import java.io.PrintStream;

public class HomeWork9 {
    public static void main(String[] args) {
        Author danbraun = new Author("Dan", "Braun");
        Author danbraun2 = new Author("Dan", "Braun");
        Author neilgaiman = new Author("Neil", "Gaiman");

        System.out.println("danbraun.equals(danbraun2) = " + danbraun.equals(danbraun2));
        System.out.println("danbraun.hashcode = " + (danbraun.hashCode() == danbraun2.hashCode()));
        System.out.println("danbraun.equals(neilgaiman) = " + danbraun.equals(neilgaiman));
        System.out.println("danbraun.hashCode(neilgeiman) = " + (danbraun.hashCode() == neilgaiman.hashCode()));

        System.out.println(danbraun);
        System.out.println(neilgaiman);

        Book americanGods = new Book(danbraun, 2002, "American gods");
        Book americanGods2 = new Book(danbraun, 2002, "American gods");
        Book code = new Book(neilgaiman, 2003, "Code");

        System.out.println("americanGods.equals(americanGods2) = " + americanGods.equals(americanGods2));
        System.out.println("americanGods.hashCode(code) = " + (americanGods.hashCode() == code.hashCode()));
        System.out.println("americanGods.equals(code) = " + americanGods.equals(code));
        System.out.println("americanGods.hashCode(americanGods2) = " + (americanGods.hashCode() == americanGods2.hashCode()));
        System.out.println(code);
        System.out.println(americanGods);
    }
}