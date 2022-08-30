public class HierarchialInheritance {
    public static void main(String[] args) {

        Mammal human =new Mammal();
        human.breathe();;
        human.eats();

    }

}

class Animal {
    void eats() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class bird extends Animal {
    void fly() {
        System.out.println("fly");
    }

}

class Mammal extends Animal {
    void walk() {
        System.out.println("walk");
    }
}
