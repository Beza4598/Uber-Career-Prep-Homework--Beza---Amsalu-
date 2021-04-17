import java.util.ArrayList;
import java.util.LinkedList;

public class Stack {
    private ArrayList<Integer> stack;
    private int current;

    public Stack(){
        stack = new ArrayList<>();
        current = -1;
    }

    public void push(int x){
        stack.add(x);
        current++;
    }

    public int pop(){
        if(this.current == -1)
            throw new IllegalArgumentException("StackUnderFlow");

        int value = stack.remove(current--);

        return value;
    }

    public int top(){
        if(this.current == -1)
            throw new IllegalArgumentException("No elements left");

        int value = stack.get(current);

        return value;
    }

    public int size(){
        return current + 1;
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(4);
        s.push(5);

        s.top();
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
