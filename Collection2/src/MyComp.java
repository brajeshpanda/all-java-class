

import java.util.*;
class MyComp implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();	// Converting object obj1 to String
		String str2 = obj2.toString();	// Converting object obj2 to String
		return str2.compareTo(str1);
		/* Here we are not modifying the return statement as we want elements 		    to be sorted in alphabetical order. */
	}
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComp());
		/* If we don�t pass any comparator object as an argument in the TreeSet 		    constructor then we will get ClassCast Exception as StringBuffer 		    Objects are not comparable. */
		t.add(new StringBuffer("Brajesh"));
		t.add(new StringBuffer("Sinha"));
		t.add(new StringBuffer("Padhle"));
		t.add(new StringBuffer("Internship"));
		System.out.println(t);
		// Output : [Internship, Padhle, Rajesh, Sinha]
	}
}