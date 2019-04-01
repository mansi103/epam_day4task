package hackerrank;

/**
* Question:
* To find middle element in the linked list
*
*/
class MiddleElement {
	class Node {
		int data;
		Node next;

		Node(int key) {
			data = key;
			next = null;
		}
	}

	Node head;

	public void push(int key) {
		if (head == null) {
			Node node = new Node(key);
			head = node;
			node.next = null;
		} else {
			Node node = new Node(key);
			node.next = null;
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public void number() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count = count + 1;
			temp = temp.next;
		}
		System.out.println("Count" + count);
		int k = 1;
		Node temp1 = head;
		while (k < ((int) (count / 2)) + 1) {
			temp1 = temp1.next;
			k++;
		}
		System.out.println("middle element is:");
		System.out.println(temp1.data);
	}

	public static void main(String[] args) {
		MiddleElement obj = new MiddleElement();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.print();
		obj.number();
	}
}
