package powerpack;
import powerpack.Node;
public class ReverseLinkList {

	public static void main(String[] args) {
		Node<Integer> numLink = new Node<Integer>();
		numLink.add(15);
		numLink.add(20);
		numLink.add(10);
		numLink.add(25);
		numLink.add(30);
		System.out.println("");
		numLink.traverse();
		numLink.reverse();
		System.out.println("");
		numLink.traverse();


	}

}
