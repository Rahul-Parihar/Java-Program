public class AbstractClasses {

    public static void main(String[] args) {

        // cow c = new cow();
        // c.eats();
        // c.walk();
        // System.out.println(c.color);

        // Peckock p = new Peckock();
        // p.eats();
        // p.walk();
        // System.out.println(p.color);

        shahiwal myCow =new shahiwal();
        // animal -> cow-> shahiwal
        

    }
}

abstract class Animal {
    String color;// constructor

    Animal() {
        System.out.println("Animal constructor called...");
    }

    void color() {
        color = "brown";

    }

    void eats() {// abstract function
        System.out.println("Eats ");
    }

    abstract void walk();// abstraction give idea to cow and peakock to implement//non abstract function
}

class cow extends Animal {
    cow() {
        System.out.println("cow constructor called.. ");
    }

    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("Walk on four legs");
    }

}

class shahiwal extends cow {
    shahiwal() {
        System.out.println("shihiwal constructor called ...");
    }
}

class Peckock extends Animal {
    void changeColor() {
        color = "blue";
    }

    void walk() {
        System.out.println("Walk on two legs");
    }
}

// error color null