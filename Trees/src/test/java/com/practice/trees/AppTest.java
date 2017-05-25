package com.practice.trees;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.* ;

import com.practice.trees.binaryTrees.*;


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

    /** Build a simple tree of integers and return the root */
    public BST<Integer> buildTree() {
        Integer[] nodes = {5, 4, 3, 2, 6, 7, 9, 10};
        List<Integer> elements = Arrays.asList(nodes);
        BST<Integer> tree = new BST<Integer>(elements);
        return tree;
    }

    public void testApp()
    {
        BST<Integer> tree = buildTree();
        System.out.println("Running test for inorder tree traversal");
        tree.inorder();
        //Manually checking the inorder trees
        System.out.println(tree.getRoot().getElement());
        assert(true);
    }
}
