package typinghomework;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6RetrieveArraylistAtGivenIndex {
    public static void main(String[] args) {
        ArrayList<String> vegetablelist = new ArrayList<>();
        vegetablelist.add("CUCUMBER");
        vegetablelist.add("POTATO");
        vegetablelist.add("CAULIFLOWER");
        vegetablelist.add("BRINJAL");
        vegetablelist.add("ONION");
        vegetablelist.add("BEETROOT");
        vegetablelist.add("MUSHROOM");
        vegetablelist.add("BITTER_GOURD");

        System.out.println(vegetablelist);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetablelist.size()) {
            System.out.println(vegetablelist.get(index));
        } else {
            System.out.println("Invalid Index!!");
        }
        scan.close();
    }
}
