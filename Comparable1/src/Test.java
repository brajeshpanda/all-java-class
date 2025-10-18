
import java.util.Comparator;
import java.util.TreeSet;
public class Test implements Comparator  
{
	public int compare(Object obj1 , Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			return 1;
		else
			return s1.compareTo(s2);
		
	
	}	
	public static void main(String[] args) {
		{
			TreeSet t = new TreeSet(new Test());
			t.add(new StringBuffer("B"));
			t.add(new StringBuffer("z"));
			t.add(new StringBuffer("a"));
			t.add(new StringBuffer("k"));
			t.add(new StringBuffer("c"));
			t.add(new StringBuffer("B"));
			t.add(new StringBuffer("m"));
			t.add(new StringBuffer("l"));
			t.add(new StringBuffer("f"));
			t.add(10);
			t.add("brajesh");
			t.add("bp");
			System.out.println(t);
		}
	}

}

