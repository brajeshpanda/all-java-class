import java.util.*;
class MyComparator1 implements Comparator	// Our custom comparator class
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = (String)obj1;		
		String str2 = obj2.toString();	
		return str2.compareTo(str1);

	}

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("Brajesh");
		t.add("Sinha");
		t.add("Padhle");
		t.add("Internship");
		t.add("24");
		t.add("E");
		System.out.println(t);
		
	}
}