public class inheritance {
    public static void main(String[] args) {
        fish shark=new fish();
        shark.eats();
        
    }
    
}

class Animal{
  String color;

  void breathe(){
    System.out.println("breathe");
  }

  void eats(){
    System.out.println("eats");
  }

}

class fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims");
    }

}
