public class SuperKeywords {
    public static void main(String[] args) {
        cat c = new cat();
        System.out.println(c.color);

    }

}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal comstructor is called... ");
    }
}

class cat extends Animal {

    cat() {
        super.color = "white";
        // super();
        System.out.println("cat constructor is called....");
    }
}
