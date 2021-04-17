import java.util.EmptyStackException;
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue;
    int front;

    public Queue(){
        queue = new LinkedList<>();
        front = -1;
    }

    public void enqueue(T x){
        queue.add(x);
        front++;
    }

    public T dequeue(){
        if(this.front == -1)
            throw new EmptyStackException();

        T value = queue.remove(0);
        front--;

        return value;
    }

    public T rear(){
        if(!queue.isEmpty())
            return queue.get(0);

        throw new EmptyStackException();
    }

    public T front(){
        if(!queue.isEmpty())
            return queue.get(front);
        else
            throw new EmptyStackException();
    }

    public int size(){
        return front +1;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public static void main(String[] args){
        Queue<Integer> q = new Queue();

        // deQueue is not possible on empty queue
        //q.dequeue();

        // enQueue 5 elements
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        int size = q.size();

        for(int i = 0; i < size; i++) {
            System.out.println(q.rear());
            q.dequeue();
        }

    }

}
