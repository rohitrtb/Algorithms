package com.practice.trees.binaryTrees;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import lombok.Getter;
import lombok.Setter;
/**
 * This class should also support methods such as finding the predecesors and successors. 
 */

@Getter
public class BST<E extends Comparable<E>> extends AbstractTree<E> {

	protected TreeNode<E> root = null;
	protected int size = 0;

	/** No args constructor. Does nothing and we are left with an empty tree */
	public BST() {

	}

	/** A constructor which accepts an array of objects as arguments. Constructs a tree from those elements */
	public BST(List<E> elements) {
		for(E e : elements) {
			insert(e);
		}
	}

	/** Helper function to create a new tree node */
	private <E extends Comparable> TreeNode<E> createNode(E element) {
		TreeNode<E> node = new TreeNode<E>(element, null, null);
		
		return node;
	}

	/**Insert an element into the tree*/
	public boolean insert(E element) {
		return insert(root,element);
	}

	/** Helper function to insert a node recursively. TODO: left and right references are not linked */
	private <E extends Comparable> boolean insert(TreeNode<E> node, E element) {
		if (node == null) {
			try {
				System.out.println("Node is null");
				node = createNode(element);
				size++;
				return true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return false;
			}
		} else {
			if (node.getElement().compareTo(element) <= 0) {
				System.out.println("node.getElement(): " + node.getElement() + " and is lesser than the element: " + element);
				return insert(node.right, element);
			} else {
				System.out.println("node.getElement(): " + node.getElement() + " and is greater than the element: " + element);
				return insert(node.left, element);
			}
		}
	}

	/** search for the presence of an element in the tree */
	public boolean search(E e) {
		return search(root, e);
	}

	/** creating a helper function to search for an element recursively */
	public <E extends Comparable> boolean search(TreeNode<E> root, E element) {
		if (root != null) {
			if (root.element.compareTo(element) == 0) {
				return true;
			} else {
				if (root.element.compareTo(element) < 0) {
					return search(root.right, element);
				} else {
					return search(root.left, element);
				}
			}
		} else {
			return false;
		}
	}

	/** Prints out Inorder traversal of the tree */
	public void inorder() {
		inorder(root);
	}
	
	/** Helper for recursively implementing the inorder tree traversal */
	private void inorder(TreeNode<E> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.element + " ");
		inorder(root.right);
	}

	/** Prints out Preorder traversal of the treee */
	public void preorder() {
		preorder(root);
	}

	/** Helper for recursively implementing the preorder tree traversal */
	private void preorder(TreeNode<E> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}

	/** Prints out postorder traversal of the tree */
	public void postorder() {
		postorder(root);
	}

	/**Helper function to recursively implement the postorder tree traversal */
	private void postorder(TreeNode<E> root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.element + " ");
	}

	/** Deletes an element from the tree. Dont forget to delete the size */
	public boolean delete(E element) {
		return true;
	}

	/** size of the binary tree */
	public int getSize() {
		return size;
	}

	/** Deletes or clears our the entire tree. dont forget to set size to 0 */
	public void clear() {

	}

	/** Iterator for the tree. Returning an inorder iterator */
	public Iterator<E> iterator() {
		return new InorderIterator();
	}

	private class InorderIterator implements Iterator<E> {
		ArrayList<E> list = new ArrayList<E>();
		private int current = 0;

		public InorderIterator() {
			inorder();
		}

		private void inorder() {
			inorder(root);
		}

		private void inorder(TreeNode<E> root) {
			if (root == null) {
				return;
			}
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		public boolean hasNext() {
			if (current < list.size()) {
				return true;
			} 
			return false;
		}

		public E next() {
			return list.get(current++);
		}
	}
}