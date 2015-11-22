/**
 * Created by Borges on 15.11.2015.
 */
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Stack s = new Stack(10);

        s.push("a");
        s.push(2);
        s.push(1);
        s.push("Hello World!");
        s.push(new Complex(10,10,true));


        s.printStack();

        System.out.println();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
