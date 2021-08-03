package SLL;

public class SinglyLinkedList {
	public Node head;
	
	public SinglyLinkedList() {
		head = null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	
	public void remove() {
		if(head != null) {
			Node runner = head;
			while(runner.next.next != null) {
				runner = runner.next;
			}
			if(runner != head) {
				runner.next = null;
			} else {
				head = null;
			}
		}
	}
	
	public void printValues() {
		if (head != null) {
			Node runner = head;
			while(runner != null) {
				System.out.println(runner.value);
				runner = runner.next;
			}
		}
	}
	
	public Node find(int val) {
		if (head != null) {
			Node runner = head;
			while(runner != null) {
				if(runner.value == val) {
					return runner;
				}
				runner = runner.next;
			}
			return null;
		} else {
			if (head.value == val) {
				return head;
			} else {
				return null;
			}
		}
		
	}
	
	public void removeAt(int n) {
		if (head != null) {
			if (n == 0) {
				Node temp = new Node(head.next.value);
				temp.next = head.next.next;
				head = temp;
			} else {
				Node runner = head;
				int i = 0;
				while(i < n - 2) {
					runner = runner.next;
					i++;
				}
				runner.next = runner.next.next;
			}
		}
	}
}
