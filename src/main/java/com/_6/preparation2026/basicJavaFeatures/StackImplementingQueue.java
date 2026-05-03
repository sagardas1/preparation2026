package com._6.preparation2026.basicJavaFeatures;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void insert(int data) {
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public void show() {
        while (!q1.isEmpty()) {
            System.out.println(q1.poll());
        }
    }

    public static void main(String[] args) {
        StackImplementingQueue myStack = new StackImplementingQueue();
        myStack.insert(1);
        myStack.insert(2);
        myStack.insert(3);
        myStack.insert(4);
        myStack.insert(5);
        myStack.show();
    }
}