import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(6);
        list.add(12);
        list.add(83);
        list.add(46);
        list.add(35);

        // System.out.println(list);

        // Get Operation

        // int element = list.get(2);
        // System.out.println(element);

        // Delete Operation

        // list.remove(2);
        // System.out.println(list);

        // set element at index

        // list.set(2,11);
        // System.out.println(list);

        // Contains Operation

        // System.out.println(list.contains(12));
        // System.out.println(list.contains(1));

        // Size of Array list

        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        // System.out.print(list.get(i)+ " ");

        // }
        // System.out.println();

        // Reverse Print

        // for (int i = list.size() - 1; i >= 0; i--) {
        //     System.out.print(list.get((i)) + " ");
        // }
        // System.out.println();


        // Find Maximum of ArrayList

        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }

            // OR
            
            max=Math.max(max, list.get(i));

        }
        System.out.println("max element ="+max);





    }

}
