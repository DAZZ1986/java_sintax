package Nascar;

public interface EngineBuilder {

    EngineBuilder setModel(String model);
    EngineBuilder setHorsePower(int horsePower);
    Engine build();
}
