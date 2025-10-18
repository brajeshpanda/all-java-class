import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(null);
		s.add(null);
		s.add('b');
		s.add("bp");
		System.out.println(s);
		s.push(55);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(30));
		System.out.println(s);
	}

}
