
import java.util.*;
class Bpanda implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		int len1 = str1.length();
		int len2 = str2.length();
		if ( len1<len2)
			return -1;
		else if(len1>len2)
			return 1;
		else
			return str2.compareTo(str1);
	}
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new Bpanda());
		t.add("Rajesh");
		t.add("Sinha");
		t.add(new StringBuffer("ATM"));
		t.add(new StringBuffer("Padhle"));
		t.add(new StringBuffer("Internship"));
		System.out.println(t);
		
	}
}