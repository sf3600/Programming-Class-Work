package com.company;

/**
 * Created by sf3600 on 2/28/2019.
 */
public class Garfield {
    //Properties:
    //species (string)
    //name (string)
    private String species;
    private String name;

    //Constructor:
    //takes no inputs
    //sets species to be "Cat" and name to be "Garfield"
    public Garfield(){
        species = "Cat";
        name = "Garfield";
    }

    //Methods:

    //Name:MakeSound
    //Inputs:none
    //What it should do: print "mmmm,  lasagna" to the screen
    //returns: nothing
    public void MakeSound(){
        System.out.println("mmm, lasagna");
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
    //calls LayOnLap method
    //print "*takes a nap*"
    //returns:nothing
    public void BeHappy(){
        LayOnLap();
        System.out.println("*takes a nap*");
    }

    ///Name:LayOnLap
    //Inputs:none
    //What it should do:
    //print "*cuddles on owner's lap*"
    //returns:nothing
    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap");
    }

    //Name:SeeLaser
    //Inputs:none
    //What it should do: calls the BeHappy method
    //returns:nothing
    public void SeeLaser(){
        BeHappy();
    }
///////////////////////////////////////////////////////
}
