



 class Main {

	public static void main(String[] args) {
		
	
		
		DoublyLinkedList<String> names = new DoublyLinkedList<>();
		
		names.insert("Adam");
		names.insert("Kevin");
		names.insert("Ana");
		names.insert("Daniel");
		
		 names.traverseForward();

	}

}

 class DoublyLinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;
	
	public void insert(T data) {
		
		Node<T> newNode = new Node<>(data);
		
		// this is the first item in the linked list
		if(tail == null) {
			
			tail = newNode;
			head = newNode;
		} else {
			// we have to insert the new item to the end of the list
			// we just have to manipulate the tail node and its references in O(1)
			newNode.setPreviousNode(tail);
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}
	
	
	public void traverseForward() {
		
		Node<T> actualNode = head;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}	
	}
	
	
	public void traverseBackward() {
			
		Node<T> actualNode = tail;
			
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getPreviousNode();
		}	
	}
}


 class Node<T extends Comparable<T>> {
	
	private T data;

	private Node<T> previousNode;
	private Node<T> nextNode;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "" + data;
	}	
}
