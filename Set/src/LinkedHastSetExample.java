import java.util.LinkedHashSet;

public class LinkedHastSetExample {

	public static void main(String[] args) {

     LinkedHashSet h= new LinkedHashSet();
		h.add(10);
		h.add(30);
		h.add(50);
		h.add(null);
		h.add(null);
		System.out.println(h.isEmpty());
		System.out.println(h.toArray());
System.out.println(h);
	}

}
