package Nascar;

public class EngineBuilderImpl implements EngineBuilder {
    Engine engine = new Engine();

    @Override
    public EngineBuilder setModel(String model) {
        engine.model=model;
        return this;
    }
    @Override
    public EngineBuilder setHorsePower(int horsePower) {
        engine.horsePower=horsePower;
        return this;
    }
    @Override
    public Engine build() {     //тут возвращается в итоге Engine, а не EngineBuilderImpl
        return engine;
    }
}
