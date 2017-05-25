package com.datastructures.linkedlist;

import com.datastructures.linkedlist.List.SingleLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SingleLinkedList<String> linkedList = new SingleLinkedList<String>();

        System.out.println("Size of the linked list is: " + linkedList.getSize());

        linkedList.addFirst("Rohit");
        linkedList.addFirst("Belapurkar");

        System.out.println("Size of the linked list is: " + linkedList.getSize());

        for(String temp : linkedList) {
            System.out.println(temp);
        }

    }
}
