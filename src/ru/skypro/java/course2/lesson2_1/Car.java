package ru.skypro.java.course2.lesson2_1;

public class Car extends Auto {

    public Car(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
        super.service();
        checkEngine();

    }
}
