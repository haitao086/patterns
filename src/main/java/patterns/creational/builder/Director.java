package patterns.creational.builder;

class Director {
    private Builder builder = new ConcreteBuilder();
    Product getAProduct(){
        builder.setPart("BMW","X7");
        return builder.getProduct();
    }
    Product getBProduct(){
        builder.setPart("Audi","Q5");
        return builder.getProduct();
    }
}