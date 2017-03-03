package powerpack;

public class Node<T> implements Comparable<T> {
	private Node<T> head;
	private T value;
	private Node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	public void add(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: " + element);
		Node<T> temp = head;
		while (true) {
			if (temp == null) {
				head = nd;
				break;
			} else if (temp.getNextRef() == null) {
				temp.setNextRef(nd);
				break;

			} else {
				temp = temp.getNextRef();
			}

		}
	}
	public void traverse(){
		Node<T> temp = head;
		while(true){
			if(temp==null){
				break;
			}
			else{
				System.out.println(temp.getValue());
				temp= temp.getNextRef();
			}
		}
	}
	
	public void reverse(){
		 System.out.println("\nreversing the linked list\n");
	        Node<T> prev = null;
	        Node<T> current = head;
	        Node<T> next = null;
	        while(current != null){
	            next = current.getNextRef();
	            current.setNextRef(prev);
	            prev = current;
	            current = next;
	        }
	        head = prev;
	//- See more at: http://www.java2novice.com/java-interview-programs/revese-singly-linked-list/#sthash.AUwYg0h2.dpuf
	}

	@Override
	public int compareTo(T o) {
		if (o == this.value) {
			return 0;
		} else {
			return 1;
		}
	}

}
