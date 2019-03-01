package com.company;

/**
 * Created by sf3600 on 2/28/2019.
 */
public class RussianBlue {
    //Properties:
    //species (string)
    //name (string)
    private String species;
    private String name;

    //Constructor:
    //sets species property to be "cat"
    //should take 1 string input and sets name property accordingly
    public RussianBlue(String name){
        species = "cat";
    }

    //Methods:

    //Name:MakeSound
    //Inputs:none
    //What it should do: print "Hisss" to the screen
    //returns: nothing
    public void MakeSound(){
        System.out.println("Hiss");
    }

    //Name:PrintName
    //Inputs:none
    //What it should do: print the name property to the screen
    //returns: nothing
    public void PrintName(){
        System.out.println(name);
    }

    //Name:BeHappy
    //Inputs:none
    //What it should do:
    //print "purrrr"
    //call SeeLaser method
    //returns:nothing
    public void BeHappy(){
        SeeLaser();
        System.out.println("purrr");
    }

    //Name:SeeLaser
    //Inputs:none
    //What it should do: print "*cat pounces*"
    //returns:nothing
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
//////////////////////////////////
}
