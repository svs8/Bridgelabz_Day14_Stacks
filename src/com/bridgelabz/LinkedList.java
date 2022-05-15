package com.bridgelabz;

public class LinkedList<T> {

    node<T> head;
    node<T> tail;

    public void push(T data) {
        node<T> newNode=new node<>(data);
        node<T> temp = head;
        if(temp==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }


    }

    public void Display() {
        node<T> temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public T peek() {
        return head.data;
    }

    public void pop(T data) {
        node<T> nodetopop=new node<>(data);
        nodetopop=head;
        node<T> nextnode=nodetopop.next;
        head=nextnode;
        nodetopop.next=null;
        nodetopop.data=null;

    }

    public void add(T data) {
        node<T> newNode=new node<>(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

}
