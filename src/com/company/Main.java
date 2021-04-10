package com.company;
import java.util.Objects;

class Dog {
    private String name;
    private String breed;
    private static int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return ("Name: " + this.getName() + " Breed: " + this.getBreed()) + " Age: " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && breed.equals(dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    

}
public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1", "field", 3);
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("Dog1", "field", 4);
        System.out.println(dog2.toString());
        Dog dog3 = new Dog("Dog3", "breed2", 2);
        System.out.println(dog3.toString());
        if (dog1.getName() == dog2.getName()) {
            System.out.println("Dogs 1 and 2 have the same name");
        }
        if (dog2.getName() == dog3.getName()) {
            System.out.println("Dogs 2 and 3 have the same name");
        }
        if (dog1.getName() == dog3.getName()) {
            System.out.println("Dogs 1 and 3 have the same name");
        } else {
            System.out.println("All dogs have different names!");
        }

        if ((dog1.getAge() > dog2.getAge()) && dog1.getAge() > dog3.getAge()) {
            System.out.println("The dog1 is the oldest and has an age of " + dog1.getAge());
        }
        if ((dog2.getAge() > dog1.getAge()) && dog2.getAge() > dog3.getAge()) {
            System.out.println("The dog2 is the oldest and has an age of " + dog2.getAge());
        }
        if ((dog3.getAge() > dog2.getAge()) && dog3.getAge() > dog1.getAge()) {
            System.out.println("The dog3 is the oldest and has an age of " + dog3.getAge());
        }
        int count = 0;
        if (dog1.getBreed() == "field") {
            count+=1;
        }
        if (dog2.getBreed() == "field") {
            count+=1;
        }
        if (dog3.getBreed() == "field") {
            count+=1;
        }
        System.out.println("Count of field breed: " + count);



    }

}
