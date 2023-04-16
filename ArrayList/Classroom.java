import java.util.ArrayList;

//import java.util.*; both are same
public class Classroom {
    public static void main(String[] args) {
        // ClassName ObjectName =newClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Operation

        list.add(1); // time complexity (big of 1) or 0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,8);
        System.out.println(list);

        // Get Operation

        // int element = list.get(4);
        // System.out.println(element);

        // Remove Operation

        // list.remove(4);
        // System.out.println(list);

        // Set element of index

        // list.set(4, 15);
        // System.out.println(list);

        // System.out.println(list.contains(15));
        // System.out.println(list.contains(45));

    }

}
