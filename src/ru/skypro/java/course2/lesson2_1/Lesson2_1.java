package ru.skypro.java.course2.lesson2_1;

public class Lesson2_1 {
        public static void main(String[] args) {
            Auto[] transport = new Auto[]{
                    new Car("car1", 4),
                    new Car("car2", 4),
                    new Truck("truck1", 6),
                    new Truck("truck2", 8),
                    new Bicycle("bicycle1", 2),
                    new Bicycle("bicycle2", 2),

            };

            ServiceStation station = new ServiceStation();
            for (Auto auto : transport) {
                station.check(auto);
            }
        }
    }
