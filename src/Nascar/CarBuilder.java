package Nascar;

public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setRaceNumber(int number);
    CarBuilder setEngine(Engine engine);
    Car build();
}
