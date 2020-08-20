
public class Driver {

	public static void main(String[] args) {
		ArrayStack stack=new ArrayStack();
		stack.push(1);
		stack.push(7);
		stack.push(3);
		stack.push(4);
		stack.push(9);
		stack.push(2);
		stack.show();
		stack.pop();


		LinkedStack stack2=new LinkedStack();
		stack2.push(1); 
	    stack2.push(7); 
	    stack2.push(3); 
	    stack2.push(4); 
	    stack2.push(9); 
	    stack2.push(2);
	    stack2.show();
	    stack2.pop();
	    stack2.removeBottomHalf();
	    stack2.show();
	}

	

}
