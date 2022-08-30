public class multiLevelInheritance {
    public static void main(String[] args) {
        Dog Dobby = new Dog();
        Dobby.legs = 4;
        System.out.println(Dobby.legs);
        Dobby.eats();

    }

}

class Animal {
    String color;

    void breathe() {
        System.out.println("breathe");
    }

    void eats() {
        System.out.println("eats");
    }

}

class Mammal extends Animal {
    int legs;

}

class Dog extends Mammal {
    String breed;

}
