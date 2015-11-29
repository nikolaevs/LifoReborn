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

    void FrontPush(E data) {
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

    void BackPush(E data) {
        StackElement <E> a = new StackElement <E>();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    public E Pop(){
        StackElement <E> t = head;
        if (t != null){
            E a = t.data;
            head = t.next;
            return (a);
        }
        else{
            return null;
        }
    }

    public E Contains(E data){
        StackElement <E> t = head;
        while (!t.equals(tail)) {
            if (t.equals(data)) {
                return data;
            }
            else{
                t = t.next;
            }
        }
        return (null);
    }

    void printList() {
        StackElement t = head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}