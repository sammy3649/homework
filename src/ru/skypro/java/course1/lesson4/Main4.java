package ru.skypro.java.course1.lesson4;

public class Main4 {
    public static void main(String[] args) {


        // Задача 1
        int i = 1;
        while (i <= 10) {
        System.out.print(i + " ");
        i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();


        // Задача 2
        for (int firstFriday = 7; firstFriday <= 31; firstFriday += 7) {
            System.out.println(" Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет. ");
        }


        // Задача 3

        int year = 2021;
        int startYear = year - 200;
        int finishYear = year + 100;

        for (int a = startYear; a < finishYear; a++) {
            if (a % 79 == 0) {
                System.out.println(" Комета прилетала каждый " + a + " год.");
            }
        }



        }

        }







