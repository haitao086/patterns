package patterns.structural.composite;

public class ComponentDemo {
    public static void main(String[] args) {
        ComponentDemo demo = new ComponentDemo();
        Composite root = new Composite();
        root.name = "root" ;
        // left
        Composite left = new Composite();
        left.name = "left";

        //right
        Composite right = new Composite();
        right.name = "right";
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        leaf1.name = "right-leaf1";
        leaf2.name = "right-leaf2";
        right.add(leaf1);
        right.add(leaf2);

        root.add(left);
        root.add(right);
        root.eachChild();




    }
}
