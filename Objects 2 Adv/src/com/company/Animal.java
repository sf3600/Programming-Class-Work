package com.company;

/**
 * Created by sf3600 on 2/19/2019.
 */
public class Animal {
    // Properties:
    //species (string)
    //name (string)
    private String species;
    private String name;

    //Constructor:
    //should take 2 string inputs and set the 2 properties accordingly
public Animal(String Species, String Name){
    species = Species;
    name = Name;
}
    //Methods:

    //Name:MakeSound
    //Inputs:none
    //What it should do: print "Grrr" to the screen
    //returns: nothing
    public void MakeSound(){
        System.out.println("Grrr");
    }
    //Name:PrintName
    //Inputs:none
    //What it should do: print the name property to the screen
    //returns: nothing
    public void PrintName(){
        System.out.println(name);
    }
//////////////////////////////////
}



