import java.util.*;

public class multiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(87);
        list.add(8);

        mainlList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(87);
        list2.add(24);
        list2.add(85);
        mainlList.add(list2);

        for (int i = 0; i < mainlList.size(); i++) {
            ArrayList<Integer> currList = mainlList.get(i);

            for (int j = 0; j < mainlList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();

        }
        System.out.println(mainlList);

    }

}
