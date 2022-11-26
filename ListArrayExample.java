package basicExample;

import java.util.*;

public class ListArrayExample {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(5);
        l.add(3);
        l.add(8);
        l.add("X");
        l.add(true);
        l.add(0,10);
        System.out.println(l);
        System.out.println("size of list is "+l.size()+"\ncheck whether or not element 10 is present "+l.contains(10));
    }
}
