package object1;

public class Person {
    private String name;
    private int age = 0;
    // height unit is centimeters
    private int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Method for getting the height of a person converted to string to log info msg.
    public String getHeight() {
        String sHeight = String.valueOf(height);
        return sHeight;
    }

    // Method for getting name of a person
    public String getName() {
        return name;
    }

    public int getAge() { return age; }
}


