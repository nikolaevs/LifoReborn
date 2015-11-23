/**
 * Created by Borges on 15.11.2015.
 */
class StackElement<E> {
    StackElement  <E> next;
    E data;
}

class Stack<E> {
    private StackElement  <E> head;
    private StackElement  <E> tail;

    void push(E data)
    {
        StackElement <E> a = new StackElement <E>();
        a.data = data;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    public E pop(){
        StackElement <E> t = head;
        if (t != null){
            E a = t.data;
            t = t.next;
            return (a);
        }
        else{
            return null;
        }
    }

    public boolean contains(E data){
        StackElement <E> t = head;
        boolean e = true;
        if (!t.equals(data)){

        }
        return (e);
    }

    void printList()
    {
        StackElement t = head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}