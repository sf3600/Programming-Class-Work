package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car BakerCar = new Car();

        System.out.println(BakerCar.model);
        Car PeteCar = new Car();
        System.out.println(PeteCar.model);
        System.out.println(BakerCar.model);
        PeteCar.DriveTillEmpty();
        System.out.println(PeteCar.milesTraveled);
        PeteCar.DriveXMiles(120);
        System.out.println(PeteCar.milesTraveled);
        PeteCar.DriveXMiles(120);
        System.out.println(PeteCar.milesTraveled);
    }
}
