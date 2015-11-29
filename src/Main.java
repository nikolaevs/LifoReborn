/**
 * Created by Borges on 15.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Stack <Integer> s = new Stack();

        s.FrontPush(1);
        s.FrontPush(2);
        s.FrontPush(4);
        s.FrontPush(6);
        s.BackPush(248);

        s.printList();
        System.out.println();
        System.out.println(s.Contains(2));
        System.out.println(s.Contains(2));
        System.out.println(s.Contains(1));
        System.out.println(s.Contains(1000000));
        System.out.println();
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
        System.out.println(s.Pop());
    }
}
