
public class ArrayStack {
	int stack[]=new int[6];	
	int top=0;
	
	//this method accepts our pushed elements and saves them to our array
	public void push(int numPush) {
		stack[top]=numPush;
		top++;
	}
	
	//this method prints out our pushed elements
	public void show() {
		System.out.print("Our pushed array elements are: ");
		for (int i: stack) {
			System.out.print(i+" ");
		}	
	}
	
	//this method pops off the bottom elements until none are left
	public int pop() {
		int numPush=0;
		for(int i=0;i<stack.length;i++) {
		numPush=stack[top-1];
		top--;
		System.out.print("\nPopping off: "+numPush);
		}
		
		return numPush;
	}
}


