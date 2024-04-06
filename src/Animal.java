public class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void run() {
        System.out.println("Running");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking!");
    }
}
class testInheritance {
    public static void main(String[]args){
        Dog d = new Dog();
        d.eat();
        d.run();
        d.bark();
    }
}
