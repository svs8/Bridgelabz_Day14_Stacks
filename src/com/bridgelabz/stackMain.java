package com.bridgelabz;

public class stackMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist=new LinkedList<>();
        linkedlist.push(70);
        linkedlist.push(30);
        linkedlist.push(56);
        System.out.println("Elements in the Stack are");

        linkedlist.Display();

        Integer peakValue1= (Integer) linkedlist.peek();
        linkedlist.pop(peakValue1);
        System.out.println("peeked value "+peakValue1);//56
        System.out.println("popped value "+peakValue1);
        linkedlist.Display();//30,70
        Integer peakValue2= (Integer) linkedlist.peek();
        linkedlist.pop(peakValue2);
        System.out.println("peeked value "+peakValue2);//30
        System.out.println("popped value "+peakValue2);
        linkedlist.Display();//70
        Integer peakValue3= (Integer) linkedlist.peek();
        linkedlist.pop(peakValue3);
        System.out.println("peeked value "+peakValue3);//70
        System.out.println("popped value "+peakValue3);

        System.out.println("=======================================================");

        LinkedList<Integer> linkedlist1=new LinkedList<>();
        linkedlist1.add(70);
        linkedlist1.add(30);
        linkedlist1.add(56);
        System.out.println("Elements in the Queue are");
        linkedlist1.Display();

        System.out.println("Dequeue operation");
        linkedlist1.pop(70);
        System.out.println("After first DEQUEUE");
        linkedlist1.Display();
        linkedlist1.pop(30);
        System.out.println("After Second DEQUEUE");
        linkedlist1.Display();
        linkedlist1.pop(56);
        System.out.println("After third DEQUEUE");
        linkedlist1.Display();


    }

}
