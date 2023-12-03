package Nascar;

public class CarBuilderImpl implements CarBuilder {
    Car car = new Car();

    @Override
    public CarBuilder setModel(String model) {
        car.model=model;
        return this;
    }
    @Override
    public CarBuilder setRaceNumber(int raceNumber) {
        car.raceNumber=raceNumber;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        car.engine=engine;
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
