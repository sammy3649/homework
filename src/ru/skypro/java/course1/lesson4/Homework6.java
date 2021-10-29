package ru.skypro.java.course1.lesson4;

public class Homework6 {
    public static void main(String[] args) {
        // Задание 1
        String firstName = " Ivan";
        String middleName = " Ivanovich ";
        String lastName = "Ivanov";
        String fullname = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника = " + fullname);


        // Задание 2
        fullname = fullname.toUpperCase();
        System.out.println(" Данные соотрудника для заполнения отчета - " + fullname);

        // Задание 3
        fullname = fullname.replace(" ", ";");
        System.out.println(" Данные сотрудника для административного отдела - = " + fullname);

        // Задание 4
        String fullname1 = " Иванов Семён Семёнович";
        fullname1 = fullname1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - = " + fullname1);
    }
}
