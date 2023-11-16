package typinghomework;

import java.util.ArrayList;
import java.util.ListIterator;

/*
Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Programme_5ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> fruitlist = new ArrayList<>();
        fruitlist.add("APPLE");
        fruitlist.add("BANANA");
        fruitlist.add("GRAPE");
        fruitlist.add("MANGO");
        fruitlist.add("KIWI");
        fruitlist.add("ORANGE");
        fruitlist.add("BLACKBERRY");
        fruitlist.add("STRAWBERRY");
        fruitlist.add("CHERRY");

        ListIterator<String> iterate = fruitlist.listIterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }

    }
}
