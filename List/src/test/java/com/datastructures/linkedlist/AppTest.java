package com.datastructures.linkedlist;

import com.datastructures.linkedlist.List.SingleLinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testEmptyLinkedListSize()
    {
        SingleLinkedList<String> linkedList = new SingleLinkedList<String>();
        assertEquals( 0, linkedList.getSize() );
    }

    public void testGetFirstElement() {
        SingleLinkedList<String> linkedList = new SingleLinkedList<String>();
        linkedList.addFirst("Rohit");
        assertEquals("Rohit", linkedList.first());
        assertEquals("Rohit", linkedList.last());
    }

    public void testGetLastElement() {
        SingleLinkedList<String> linkedList = new SingleLinkedList<String>();
        linkedList.addLast("Rohit");
        assertEquals("Rohit", linkedList.last());
        assertEquals("Rohit", linkedList.first());
    }

    public void testFirstEnqueueDequeue() {
        SingleLinkedList<String> linkedList = new SingleLinkedList<String>();
        linkedList.addFirst("Rohit");
        linkedList.addFirst("Belapurkar");
        linkedList.addFirst("Vyankatesh");
        assertEquals(3, linkedList.getSize());
        assertEquals("Rohit", linkedList.last());
        assertEquals("Vyankatesh", linkedList.first());
        assertEquals("Vyankatesh", linkedList.removeFirst());
        assertEquals("Belapurkar", linkedList.first());
        assertEquals("Belapurkar", linkedList.removeFirst());
        assertEquals("Rohit", linkedList.first());
        assertEquals("Rohit", linkedList.removeFirst());
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
    }
}
