package com.practice.trees.binaryTrees;

import java.lang.Iterable;

public interface TreeInterface<E> extends Iterable<E> {

	/** Searches for an element E in the tree */
	public boolean search(E e);

	/** Insert an element into the tree */
	public boolean insert(E e);

	/** Deletes an element E in the tree */
	public boolean delete(E e);

	/** Prints out the elements of the tree in an inorder manner */
	public void inorder();

	/** Prints out the elements of the tree in a preorder manner */
	public void preorder();

	/** Prints out the elements of the tree in a postorder manner */
	public void postorder();

	/** Size of the tree */
	public int getSize();

	/** Is empty */
	public boolean isEmpty();

	/** Clears out the binary tree*/
	public void clear();

}