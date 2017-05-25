/** 
 * Abstract tree class which implements some of the methods of the TreeInterface 
 */
package com.practice.trees.binaryTrees;

public abstract class AbstractTree<E> implements TreeInterface<E> {

	/** Inorder traversal of the tree */
	@Override
	public void inorder() {

	}

	/** Preorder traversal of the tree */
	@Override
	public void preorder() {

	}

	/** Postorder traversal of the tree */
	@Override
	public void postorder() {

	}

	/** Returns true if the tree is empty */
	@Override
	public boolean isEmpty() {
		return (getSize() == 0);
	}
}