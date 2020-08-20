

public class LinkedStack {
	Node head;  // Reference to the first LinkedNode in the list
	int count;
	
	//this method accepts our push elements and adds them to our linked list
	public void push(int numPush) {
		Node node = new Node();
		node.numPush = numPush;
		node.next = null;
		if (head==null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
				
			}
			n.next = node;	
		}
		count++;
		}
	
	//this method prints out our current linked list
	public void show() {
		Node node = head;
		System.out.print("\n\nOur pushed linked elements are: ");
		while(node!=null) {
			System.out.print(node.numPush+" ");
			node=node.next;
			
		}
	}
	
	//this method pops out our first inputted integers
	public void pop() {
		Node node = head;
		while(node!=null) {
			int popped = node.numPush;
			node=node.next;
			System.out.print("\nPopping off: "+popped);
		}
		
	}
	
	//this method removes the bottom half of our linked list 
	   public void removeBottomHalf() {
           int half = 0;
           if (count % 2 != 0) {
                 half = (count + 1) / 2;
           } else {
                 half = count / 2;
           }
           Node last = head;
           for (int i = 0; i < half-1; i++) {
                 last = last.next;
           }
           if (last != null) {
                 last.next = null;
                 count = half;

           }
           System.out.print("\n\nRemoving bottom half...");
     }
	
	
	


}
	


