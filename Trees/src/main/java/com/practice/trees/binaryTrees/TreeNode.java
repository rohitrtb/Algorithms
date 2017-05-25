/**
 * Class for Tree Node. This class does not have a parent pointer. In order to get a parent, iterate through the tree and see if 
 * you get the parent. 
 */
package com.practice.trees.binaryTrees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode<E extends Comparable> {
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;

	public TreeNode (E e, TreeNode<E> left, TreeNode<E> right) {
		System.out.println("Creating a tree node for element: " + e);
		this.element = e;
		this.left = left;
		this.right = right;
	}
}