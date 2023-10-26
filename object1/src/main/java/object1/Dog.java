package object1;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private String gender;

    public Dog(String name, int age, String breed, String gender) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to get the gender of a dog
    public String getGender() {
        return gender;
    }

    // Method to set the gender of a dog
    public void setGender(String gender) {
        this.gender = gender;
    }
}