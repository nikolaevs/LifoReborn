/**
 * Created by Borges on 15.11.2015.
 */
public class Stack <T> {
    private Object[] arr;
    private int size;
    private int position;


    public Stack(int size){
        this.position = 0;
        this.size = size;
        this.arr = new Object[size];
    }

    public void push(T o){
        if (position >= size) {
            System.out.println("Stack is full");
            return;
        }
        arr[position++] = o;
    }

    public Object pop(){
        if (position == 0){
            System.out.println("Stack is empty");
            return null;
        }
        return arr[--position];
    }

    public void printStack(){
        for(int i = 0; i < position;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
