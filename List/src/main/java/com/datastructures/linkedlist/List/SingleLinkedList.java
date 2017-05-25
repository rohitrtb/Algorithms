package com.datastructures.linkedlist.List;

import com.datastructures.linkedlist.ListException.ListUnderflowException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class implements the list interface for a single linked list
 */
@Getter
public class SingleLinkedList <T> implements List<T>, Iterable<T> {

    @Setter
    @Getter
    @AllArgsConstructor
    private static class Node<T> {
        private T element;
        private Node<T> next;
    }

    private class SingleLinkedListIterator implements Iterator<T> {

        private int cursor; //the starting point of the iterator
        private Node<T> currentNode;

        public SingleLinkedListIterator(Node<T> head) {
            cursor = 0;
            currentNode = head;
        }

        public boolean hasNext() {
            return this.cursor < SingleLinkedList.this.size;
        }

        public T next() {
            if (this.hasNext()) {
                cursor++;
                currentNode = currentNode.getNext();
                if (currentNode == null) {
                    System.out.println("Current Node is null");
                }
                return currentNode.getElement();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("remove() is not yet supported");
        }
    }


    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SingleLinkedList () {
        head = null;
        tail = null;
        size = 0;
    }

    private void incrementSize() {
        size++;
    }

    private void decrementSize() {
        if (size == 0) {
            throw new ListUnderflowException("Size is 0 and attempting to decrement it further");
        }
         size--;
    }

    public T first() {
        if (head == null) {
            return null;
        } else {
            return head.getElement();
        }
    }

    public T last() {
        if (tail == null) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(T t) {
        Node<T> newNode = new Node<T>(t,head);
        head = newNode;
        if (tail == null ) {
            tail = newNode;
        }
        incrementSize();
    }

    public void addLast(T t) {
        Node<T> newNode = new Node<T>(t, null);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        incrementSize();
    }

    public T removeFirst() {
        if (head == null) {
            throw new ListUnderflowException("Attempting to dequeue from an empty list");
        }
        Node<T> tempNode = head;
        head = head.getNext();
        decrementSize();
        return tempNode.getElement();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Iterator<T> iterator() {
        return new SingleLinkedListIterator(head);
    }
}
