package ru.skypro.java.course2.lesson2_1;

public class Auto {
    private final String modelName;
    private final int wheelsCount;

    public Auto(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

}
