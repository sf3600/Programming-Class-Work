package com.company;

/**
 * Created by sf3600 on 2/1/2019.
 */
public class Car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double mpg;
    double tankSize;
    double gallonsOfGas;

    //constructor
    public Car() {
        make = "Ford";
        model = "Escape";
        mpg = 24;
        tankSize = 12;
        gallonsOfGas = tankSize;
    }
    public Car(String Make, String Model, double MPG, double TankSize){
        make = Make;
        model = Model;
        mpg = MPG;
        tankSize = TankSize;
        gallonsOfGas = tankSize;

    }
    //methods
    public void DriveTillEmpty() {
        milesTraveled = milesTraveled + mpg * gallonsOfGas;
        gallonsOfGas = 0;
    }
    public void FillTank(){
        gallonsOfGas = tankSize;
    }
    public void DriveXMiles(double x){
        if(gallonsOfGas >= x/mpg) {
            //have enough
            milesTraveled = milesTraveled + x;
            gallonsOfGas = gallonsOfGas - x / mpg;
        }
        else {
        //didn't have enough gallons
        DriveTillEmpty();

    }

}
