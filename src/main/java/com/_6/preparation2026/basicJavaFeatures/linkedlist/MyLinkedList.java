package com._6.preparation2026.basicJavaFeatures.linkedlist;


class Node{
    int data;
    Node next;

}
public class MyLinkedList {

    Node head;
    static int size;
    public void insert(int data){
        Node node =new Node();
        node.data=data;
        if(head==null){
            head=node;
        }else{
            Node temp =head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size+=1;
    }

    public void insert(int data, int index) {
        Node node = new Node();
        node.data = data;
        if (index > size) {
            throw new IndexOutOfBoundsException("index out of bound");
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

    public void show(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void delete(int index){
        if (index>size ||index==size){
            throw new IndexOutOfBoundsException("index out of bound");
        }
        Node temp=head;
        for (int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        size -= 1;

    }

    public void reverse(){
        Node current=head;
        Node prev=null;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }

    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5,0);
        list.insert(6,3);
        list.show();
        System.out.println("-----------");
        list.delete(2);
        list.show();
        System.out.println("-----------");
        list.show();
        System.out.println("-----------");
        list.reverse();
        list.show();
    }



}
