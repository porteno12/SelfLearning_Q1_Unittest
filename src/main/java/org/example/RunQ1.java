package org.example;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.insert(23);
        queue.insert(32);
        queue.insert(45);
        queue.insert(54);
        queue.insert(67);
        queue.insert(76);

        boolean result = q1(queue);
        System.out.println("Does the queue have bidirectional digits? " + result);
    }









}