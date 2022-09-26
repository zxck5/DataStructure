package binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5639_SearchingBinaryTree {
	
	//https://www.acmicpc.net/problem/5639
	// Example:
	
	/*
	 * A binary search tree is a binary tree that satisfies the following three conditions.

	The key of every node in the left subtree of the node is less than the key of the node.
	All nodes in the subtree to the right of the node have a key greater than the node's key.
	The left and right subtrees are also binary search trees.
	

	preorder traversal (root-left-right) visits the root, and outputs the node's key 
	while visiting the left subtree and then the right subtree in that order. 
	Post-order traversal (left-right-root) outputs keys in the order of left subtree, right subtree, and root node. 
	For example, the preorder traversal result of the binary search tree above is 50 30 24 5 28 45 98 52 60 
	,and the post order traversal result is 5 28 24 45 30 60 52 98 50 .

Given the results of a binary search tree, write a program to find the result of a preorder traversal of this tree.
	
	 * 
	 * */
	
	static Node root;
	static StringBuilder sb = new StringBuilder();
	
	static class Node {
		Integer value;
		Node left;
		Node right;		
		public Node (int value) {
			this.value = value;
		}
		public Node (int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public void insertNode(Node n) {
			
			if (this.value > n.value) {
				if (this.left == null) {
					this.left = new Node(n.value);
					return;
				} else this.left.insertNode(n);
			} else {
				if (this.right == null) {
					this.right = new Node(n.value);
					return;
				} else this.right.insertNode(n);
			}
		}
	}
	
	public static void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		root = new Node(Integer.parseInt(br.readLine()));
		String s;
		while (true) {
			s = br.readLine();
			if (s == null || s.equals("")) {
				break;
			}
			root.insertNode(new Node(Integer.parseInt(s)));
		}
	}
	
	public static void pro() {
		preOrder(root);
		System.out.println(sb);
	}
	
	public static void preOrder(Node node) {
		if (node == null) {
			return;
		}
		
		preOrder(node.left);
		preOrder(node.right);
		
		sb.append(node.value).append('\n');
		
	}
	
	
	public static void main(String[] args) throws IOException {
		input();
		pro();
	}
}
