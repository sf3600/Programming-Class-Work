package com.company;

/**
 * Created by sf3600 on 2/26/2019.
 */
public class Dog {
    //Properties:
//species (string)
//name (string)
//dockedTail (boolean)
    private String species;
    private String name;
    private boolean dockedTail;

    //Constructor:
    public Dog(String name, boolean dockedTail ) {
//should set species to be "Dog"
        species = "Dog";

//should take 1 string and a boolean inputs and set the 2 other properties accordingly
    }

    //Methods:
// Name:MakeSound
    //Inputs:none
    //What it should do: print "Woof" to the screen
    //returns: nothing
    public void MakeSound(){
        System.out.println("Woof");
    }
    //Name:PrintName
    //Inputs:none
//What it should do: print the name property to the screen
    //returns: nothing
    public void PrintName(){
        System.out.println(name);
    }

    //Name:PlayFetch
    //Inputs:none
    //What it should do: print "*chases ball 5 times then quits*" to the screen
    //returns: nothing
public void PlayFetch(){
    System.out.println("*chases ball 5 times then quits*");
}

    //Name:getDockedTail
    //Inputs:none
    //What it should do: returns the dockedTail property
    public boolean getDockedTail(){
    return getDockedTail();
    }
//////////////////////////////////
}
