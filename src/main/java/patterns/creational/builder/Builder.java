package patterns.creational.builder;

abstract class Builder {
    abstract void setPart(String arg1, String arg2);

    abstract Product getProduct();

}
