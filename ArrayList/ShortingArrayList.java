import java.util.*;

public class ShortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(445);
        list.add(78);
        list.add(25);
        list.add(587);

        System.out.println(list);
        Collections.sort(list); //Ascending Order
        System.out.println(list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        
    }
    
}
