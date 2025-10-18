import java.util.*;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		LinkedHashMap h=new LinkedHashMap();
		h.put(100,"brajesh");
		h.put(200,"rajesh");
		h.put(300,"umesh");
		h.put(400,"umesh");
		h.put(500,"bp");
		h.put(500,"ramesh");
		h.put(600,"kamlesh");
		h.put(700,"suresh");
		h.put(800,"surya");
		System.out.println(h);
		System.out.println(h.put(700,10));
		System.out.println(h.get(500));
		System.out.println(h.remove(100));
		System.out.println(h.size());
		System.out.println(h.containsKey(800));
		System.out.println(h.isEmpty());
		System.out.println(h.keySet());
		
		
	}

}
