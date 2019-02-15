package com.company;

/**
 * Created by sf3600 on 2/4/2019.
 */
//properties
public class Animal {
    private String species;
    private String name;
    private String color;
    private int age;

    public Animal(String Species, String Name, String Color) {
        species = Species;
        name = Name;
        color = Color;
        age = 0;
    }
    public void MakeSound() {
        System.out.println("Grrrrr");
    }

    public void SetAge(int newAge) {
        age = newAge;
    }

    public void PrintDescription() {
        System.out.println(name + " is a " + age + " year old, " + color + " " + species);
    }

}

