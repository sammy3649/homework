package ru.skypro.java.course2.lesson2_1;

public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

}

