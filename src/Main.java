/**
 * Created by Borges on 15.11.2015.
 */
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Stack <Integer> s = new Stack();

        s.push(1);
        s.push(2);
        s.push(4);
        s.push(6);

        s.printList();
        System.out.println();
        System.out.println(s.pop());
        System.out.println();
        System.out.println(s.contains(2));
        System.out.println(s.contains(2));
        System.out.println(s.contains(1));
        System.out.println(s.contains(1000000));
    }
}
