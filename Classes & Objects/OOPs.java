public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created pen object called p1
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Green");
        p1.color = "Green";

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Rahul";
        // myAcc.Password="ahuufjd"; // not accesible because of private
        myAcc.setPassword("qwwert");
    }

}

class BankAccount {
    public String username;
    private String Password;

    public void setPassword(String pwd) {
        Password = pwd;

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String Name;
    int Age;
    float Percentage;

    void calcPercentage(int phy, int chem, int maths) {
        Percentage = (phy + chem + maths) / 3;
    }
}