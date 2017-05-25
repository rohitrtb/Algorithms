package com.datastructures.linkedlist.List;

/**
 * This is an interface of list and defines the most commonly used methods which should be implemented by any
 * class which implements this interface
 */
public interface List <T> {

    /** Returns the size of the list in terms of number of elements */
    int size();

    /** Returns if a list is empty or not */
    boolean isEmpty();

    /** Returns (but does not remove) the first element in the list */
    T first();

    /** Returns (but does not remove) the last element in the list */
    T last();

    /** Adds an element to front of the list */
    void addFirst(T t) ;

    /** Adds an element to the end of the list */
    void addLast(T t);

    /** Remove the first element of the list */
    T removeFirst();
}
