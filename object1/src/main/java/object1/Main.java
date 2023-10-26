package object1;

import java.util.logging.Logger;

public class Main {



    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Bob", 33, 178);
        logger.info(person.getHeight());
        Dog dog = new Dog("Maddix", 8, "Labrador", "Male");
        logger.info("My dog was " + dog.getName() + " and he was a " + dog.getGender() + dog.getBreed());
        Chair chair = new Chair("Suede", "Red", 4);
        logger.info("The chair is " + chair.getMaterial() + " and the color is " + chair.getColor());

        Car[] cars = new Car[10];

        Car car1 = new Car("Honda", "CR-V", 2017, 83423);
        Car car2 = new Car("Honda", "Civic", 2015, 53325);
        Car car3 = new Car("Honda", "Accord", 2024, 3423);
        Car car4 = new Car("Ford", "Taurus", 2003, 397882);
        Car car5 = new Car("Ford", "Pinto", 1976, 2);
        Car car6 = new Car("BMW", "i3", 2013, 11203);
        Car car7 = new Car("Toyota", "Corolla", 2017, 83423);
        Car car8 = new Car("Toyota", "Camryy", 2009, 226421);
        Car car9 = new Car("Hyundai", "Thing", 2045, 0);
        Car car10 = new Car("Jeep", "Wrangler", 2007, 102438);

        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        cars[5] = car6;
        cars[6] = car7;
        cars[7] = car8;
        cars[8] = car9;
        cars[9] = car10;

        Car favCar = cars[3];
        String favCarMake = favCar.getMake();
        String favCarModel = favCar.getModel();

        logger.info("My favorite car is the " + favCarMake + " " + favCarModel);




    }

}