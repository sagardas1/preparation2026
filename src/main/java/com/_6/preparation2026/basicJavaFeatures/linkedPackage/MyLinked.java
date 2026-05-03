package com._6.preparation2026.basicJavaFeatures.linkedPackage;

class Node {
    int data;
    Node next;

}

public class MyLinked {

    Node head;
    static int size = 0;


    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
        size += 1;
    }

    public void insert(int data, int index) {
        Node node = new Node();
        node.data = data;
        if (index > size) {
            throw new IndexOutOfBoundsException("");
        }
        if (head == null) {
            head = node;
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size += 1;
    }


    public void delete(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void show(){
        Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
    }

    public void reverse(){
        Node current=head;
        Node next=null;
        Node prev= null;


        while (current!=null){
          next=current.next;
          current.next=prev;
          prev=current;
          current=next;

        }
        head=prev;
    }


    public static void main(String[] args) {
        MyLinked myLinked = new MyLinked();
        myLinked.insert(10);
        myLinked.insert(20);
        myLinked.insert(30);
        myLinked.insert(40);
        myLinked.insert(50, 2);
        myLinked.delete(2);
        myLinked.show();
        System.out.println("");
        myLinked.reverse();
        myLinked.show();
    }
}
