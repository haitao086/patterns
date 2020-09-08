package patterns.creational.abstractFactory;

class FactoryBenzB implements IAbstractFactory {
    @Override
    public IEngine createEngine() {
        return new EngineB();
    }

    @Override
    public IAircondition createAircondition() {
        return new AirconditionB();
    }
}
