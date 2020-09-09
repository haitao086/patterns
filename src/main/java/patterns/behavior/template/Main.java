package patterns.behavior.template;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Tom");
        s.prepareGotoSchool();

        System.out.println("------------");
        Teacher t= new Teacher("Jack");
        t.prepareGotoSchool();
    }
}
