package main.java.day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        /*
        Queue'larda ilk gelen ilk isleme girer.(First In First Out)==FIFO
        Bazen de son gelen ilk isleme girer.(Last In Fırst Out)==LIFO
        "Deque" "Double ended Queue"
         */

        Queue<String> MyQu = new LinkedList<>();

        MyQu.add("Milk");
        MyQu.add("Butter");
        MyQu.add("Jam");
        MyQu.add("Egg");
        MyQu.add("Luxury water");

        System.out.println(MyQu);

        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty
        MyQu.poll();

        //Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns: the head of this queue
        //Throws: NoSuchElementException – if this queue is empty
        MyQu.remove();

        //Retrieves, but does not remove, the head of this queue.
        //This method differs from peek only in that it throws on exception if this queue is empty.
        //Throws: NoSuchElementException - if this queue is empty
        MyQu.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        MyQu.peek();

        /*
        poll() ile remove() ikisi de elemani siler ve size verir.
        poll() bos "Queue" lar icin "null" verir, remove() ise "Queue" lar icin "Exception" verir.

         */
        MyQu.offer("Avocado");
        System.out.println(MyQu);

        // offer ekleme yapmak icin kullabilir.

        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);


    }
}
