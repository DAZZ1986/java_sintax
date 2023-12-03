package Nascar;

public class Car {

    String model;
    int raceNumber;
    Engine engine;






    public void print() {
        System.out.println("Model: "+model + "\n" +
                "RaceNumber: "+raceNumber + "\n" +
                "Engine model: "+engine.model + "\n" +
                "Engine horsePower: "+engine.horsePower + "\n");
    }


}
