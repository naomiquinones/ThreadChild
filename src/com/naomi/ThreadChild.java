package com.naomi;
// Java program demonstrate that a child thread
// gets the same priority as the parent

public class ThreadChild extends Thread {

    public void run() {
        System.out.println("In run method ");
    }

    public static void main(String[] args) {
        // main thread priority is 6
        Thread.currentThread().setPriority(6);
        System.out.println("Main thread: " + Thread.currentThread().getPriority());

        ThreadChild tchild1 = new ThreadChild();
        // tchild1 thread is child of main thread

        ThreadChild tchild2 = new ThreadChild();
        // tchild2 thread is child of main thread

        System.out.println("Child 1 priority: " + tchild1.getPriority());
        System.out.println("Child 2 priority: " + tchild2.getPriority());

        tchild2.run();
        tchild1.run();
    }
}
