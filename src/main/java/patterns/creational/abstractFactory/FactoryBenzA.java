package patterns.creational.abstractFactory;

class FactoryBenzA implements IAbstractFactory {
    @Override
    public IEngine createEngine() {
        return new EngineA();
    }

    @Override
    public IAircondition createAircondition() {
        return new AirconditionA();
    }
}
