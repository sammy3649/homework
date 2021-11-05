package ru.skypro.java.course1.lesson6;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;

public class Homework6 {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullname = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника = " + fullname);


        // Задание 2
        String upperFullname = fullname.toUpperCase();
        System.out.println(" Данные соотрудника для заполнения отчета - " + upperFullname);

        // Задание 3
        fullname = fullname.replace(" ", ";");
        System.out.println(" Данные сотрудника для административного отдела - " + fullname);

        // Задание 4
        String fullname1 = " Иванов Семён Семёнович";
        fullname1 = fullname1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - = " + fullname1);

        // Задание 5
        String fullname2 = "Ivanov Ivan Ivanovich";
        String lastName2 = fullname2.substring(0, fullname2.indexOf(" "));
        String firstName2 = fullname2.substring(fullname2.indexOf(" ") + 1, fullname2.lastIndexOf(" "));
        String middleName2 = fullname2.substring(fullname2.lastIndexOf(" ") + 1);
        System.out.println("Имя сотрудника - " + firstName2);
        System.out.println("Фамилия сотрудника - " + lastName2);
        System.out.println("Отчество сотрудника - " + middleName2);

        // Задание 6

        String fullname3 = "ivanov ivan ivanovich";
        String[] words = fullname3.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] miniWords = words[i].toCharArray();

            if (Character.isLowerCase(miniWords[0])) {
                miniWords[0] = Character.toUpperCase(miniWords[0]);
                words[i] = new String(miniWords);

            }
        }
        System.out.println(String.join(" ", words));

        // Задание 7
        String str1 = "135";
        String str2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));

        }
        String finish = sb.toString();
        System.out.println("Данные строки - " + finish);


    }
}
