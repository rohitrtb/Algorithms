package com.datastructures.linkedlist.ListException;

/**
 * Exception thrown when there is an underflow in the list
 */
public class ListUnderflowException extends RuntimeException {

    public ListUnderflowException (String message) {
        super(message);
    }
}
