import java.util.*;

public class strs {

    public static void printLatters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // String s = "Sa";
        // String s1 = new String("Rahul");

        // String Are immutable

        // String name;
        // name=sc.next();
        // System.out.println(name);

        // String Fullname="Rahul Pariahr";
        // System.out.println(Fullname.length());

        // CONCATENATION

        String FirstName ="Rahul";
        String LastName = "Parihar";
        String FullName = FirstName + " " + LastName;
        //System.out.println(FullName);
        // System.out.println(FullName.charAt(1));

        printLatters(FullName);

    }

}
