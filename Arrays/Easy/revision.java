
import java.util.*;

public class revision {
    public static void main(String[] args) {
        
        // arraylist

        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get
        int element = list.get(1);

        System.out.println(element);

        // add element in between
        list.add(1,1);
        System.out.println(list);

        // change element --> set 
        list.set(0,5);
        System.out.println(list);

        // delete
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loop
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        // sorting
        // collections --> frameworks used to sort an array
        Collections.sort(list);
        System.out.println(list);

    }
}
