package com.company;

public class LinkedList {
    Node head;
    Node current;

    public  LinkedList(){
        head = null;
        current = head;
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node(int data){
            this(data, null);
        }

        public String toString(){
            return data + " " ;
        }
    }

    public void push(Node node){
        if(head == null){
            head = node;
            current = head;
        } else{
            current.next = node;
            current = current.next;
        }
    }

    public Node pop(){
        Node last = current;
        Node temp = head;

        while(temp.next != last){
            temp = temp.next;
        }

        temp.next = null;

        return last;
    }

    public void insert(int index, Node node){
        int ctr = 0;
        Node temp = head;

        while(ctr < index-1){
            ctr++;
            if(temp.next != null)
                temp = temp.next;
            else
                temp = null;
        }

        if(temp != null) {
            Node oldNext = temp.next;
            temp.next = node;
            node.next = oldNext;
        }

    }

    public void remove(int index){
        int ctr = 0;
        Node temp = head;

        if(index == 0){
            head = temp.next;
        } else {

            while (ctr < index - 1) {
                ctr++;

                if (temp.next != null)
                    temp = temp.next;
                else
                    temp = null;

            }

            if (temp != null) {
                if (temp.next != null)
                    temp.next = temp.next.next;
            }
        }
    }

    public Node elementAt(int index){
        int ctr = 0;
        Node temp = head;

        while(ctr < index){

            if(temp.next != null)
                temp = temp.next;
            else
                temp = null;

            ctr++;
        }

        return temp;
    }

    public int size(){
        Node temp = head;
        int sizeCtr = 0;

        while(temp != null){
            sizeCtr++;
            temp = temp.next;
        }

        return sizeCtr;
    }

    public void printList(){
        Node temp = head;
        StringBuilder str = new StringBuilder();

        while(temp != null){
            str.append(temp.toString());
            temp = temp.next;
        }

        System.out.println(str.toString());
    }

    public static void main(String[] args){
        LinkedList x = new LinkedList();

       x.push(new Node(1));
       x.push(new Node(2));
       x.push(new Node(3));
       x.push(new Node(4));

       x.printList();
       System.out.println(x.size());

       x.insert(2, new Node(1));
       x.printList();
       x.remove(0);
       x.printList();

    }
}
