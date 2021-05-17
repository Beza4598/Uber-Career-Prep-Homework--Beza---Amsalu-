package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> y = new LinkedList<>();
        LinkedList<Integer> k = new LinkedList<>();
        y.add(4);
        y.add(3);
        y.add(2);
        y.add(1);
        System.out.println(reverseLinkedList3(y, k));
    }

    public static LinkedList<Integer> reverseLinkedList1(LinkedList<Integer> x){

        int size = x.size();
        int j = size -1;
        LinkedList<Integer> result = new LinkedList<>();

        for(int i = 0; i < size; i++){
                if(!(i >= j)) {
                    result.add(i, x.get(j));
                    j--;
                }
            }

        return result;

    }

    public static LinkedList<Integer> reverseLinkedList2(LinkedList<Integer> x){
        Stack<Integer> stack = new Stack<>();

        Iterator itr = x.iterator();
        int i = 0;

        while(itr.hasNext()){
            stack.push((Integer)itr.next());
        }
        LinkedList<Integer> result = new LinkedList<>();
        int size = stack.size();
        for(int j = 0; j < size; j++){
            result.add(stack.pop());
        }

        return result;
    }

    public static LinkedList<Integer> reverseLinkedList3(LinkedList<Integer> x, LinkedList<Integer> result){
        if(x.size() == 0){
            return result;
        }

        result.add(x.getLast());
        x.removeLast();
        return reverseLinkedList3(x, result);
    }


}
