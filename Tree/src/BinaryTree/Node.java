package BinaryTree;

public class Node <Key extends Comparable<Key>,Value> {
	private Key id;  // key는 comparable 이라 비교연산 수행
	private Value name;
	private Node left, right;
	public Node(Key newId, Value newName) {
		id = newId;
		name = newName;
		left = right = null;
	}
	public Key getId() {
		return id;
	}
	public void setId(Key id) {
		this.id = id;
	}
	public Value getName() {
		return name;
	}
	public void setName(Value name) {
		this.name = name;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
