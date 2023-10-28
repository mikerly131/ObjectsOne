package object1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTest {

    //  Setting up an object of each class to test with
    Car car1 = new Car("Honda", "CR-V", 2017, 83423);
    Chair chair1 = new Chair("Cedar", "Brown", 4);
    Dog dog1 = new Dog("Bobbi", 9, "Dachshund", "Female");

    Person person1 = new Person("Tommylee McDavid", 30, 183);



    // Testing Chair Class

    @Test
    public void getMaterialTest() {
        String testChair = chair1.getMaterial();
        String validMaterial = "Cedar";
        assertEquals(testChair, validMaterial);
        System.out.println("Material test passed");
    }

    @Test
    public void setMaterialTest() {
        chair1.setMaterial("Mahogony");
        String testMaterial = "Mahogony";
        String chairMaterial = chair1.getMaterial();
        assertEquals(testMaterial, chairMaterial);
        System.out.println("Material was set");
    }

    @Test
    public void getColorTest() {
        String testChair = chair1.getColor();
        String testColor = "Brown";
        assertEquals(testChair, testColor);
        System.out.println("Color test was passed");
    }

    @Test
    public void setColorTest() {
        chair1.setColor("Blue");
        String testColor = "Blue";
        String chairColor = chair1.getColor();
        assertEquals(testColor, chairColor);
        System.out.println("Color was set");
    }

    @Test
    public void getLegsTest() {
        int chairLegs = chair1.getLegs();
        int testLegs = 4;
        assertEquals(chairLegs, testLegs);
        System.out.println("Leg test was passed");
    }

    @Test
    public void setLegsTest() {
        chair1.setLegs(3);
        int testLegs = 3;
        int chairLegs = chair1.getLegs();
        assertEquals(testLegs, chairLegs);
        System.out.println("Legs were set");
    }

    // Testing Car Class
    @Test
    public void getCarMakeTest() {
        String testCar = car1.getMake();
        String validMake = ("Honda");
        assertEquals(testCar, validMake);
        System.out.println("Make test passed");
    }

    // Test the getModel method of the class, assertEquals or assertTrue?  Does it matter?
    @Test
    public void getCarModelTest() {
        String testCar = car1.getModel();
        String validModel = ("CR-V");
        assertEquals(testCar, validModel);
        System.out.println("Model test passed");
    }

    // Test the getYear method of the class
    @Test
    public void getCarYearTest() {
        int testCar = car1.getYear();
        int validYear = 2017;
        assertTrue(testCar == validYear);
        System.out.println("Year test passed");
    }

    // Test the getMileage method of the class
    @Test
    public void getCarMileageTest() {
        int testCar = car1.getMileage();
        int validMileage = 83423;
        assertTrue(testCar == validMileage);
        System.out.println("Miles test passed");
    }

    // I thing I get the gist of this for Objects1.
    @Test
    public void getPersonNameTest() {
        String testPerson = person1.getName();
        String validPerson = ("Tommylee McDavid");
        assertEquals(testPerson, validPerson);
        System.out.println("Person name test passed");
    }

    @Test
    public void getPersonAgeTest() {
        int testPerson = person1.getAge();
        int validAge = 30;
        assertTrue(testPerson == validAge);
        System.out.println("Person age test passed");
    }

    @Test
    public void getPersonHeightTest() {
        String testPerson = person1.getHeight();
        String validHeight = ("183");
        assertEquals(testPerson, validHeight);
        System.out.println("Person height test passed");
    }

  
    @Test
    public void getDogNameTest() {
        String test = dog1.getName();
        String valid = ("Bobbi");
        assertEquals(test, valid);
        System.out.println("Dog name test passed");

    }
    @Test
    public void getDogAgeTest() {
        int test = dog1.getAge();
        int valid = 9;
        assertTrue(test == valid);
        System.out.println("Dog age test passed");
    }
    @Test
    public void getDogBreedTest() {
        String test = dog1.getBreed();
        String valid = ("Dachshund");
        assertEquals(test, valid);
        System.out.println("Dog name test passed");
    }
    @Test
    public void getDogGenderTest() {
        String test = dog1.getGender();
        String valid = ("Female");
        assertEquals(test, valid);
        System.out.println("Dog gender test passed");
    }


}
