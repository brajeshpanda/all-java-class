import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator2 {
	
	public int compare(Object o1 , Object o2)
	{
		String s1= (String)o1;
		String s2= (String)o2;
		
		return s2.compareTo(s1);
	}
    public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("brajesh");
		t.add("bp");
		t.add("rajesh");
		t.add(" ");
		t.add("bikash");
		t.add("subash");
		t.add("umesh");
		t.add("ramesh");
		System.out.println(t);
		
    }
}
