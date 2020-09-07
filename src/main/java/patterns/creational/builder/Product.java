package patterns.creational.builder;


class Product {
    private String name;
    private String type;

    void showProduct() {
        System.out.println("Name：" + name);
        System.out.println("Type：" + type);
    }

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }
}