import java.util.Comparator;
import java.util.TreeSet;
public class MyComparator implements Comparator  
{
	public int compare(Object obj1 , Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		return 0;
	}	
	public static void main(String[] args) {
		{
			TreeSet t = new TreeSet(new MyComparator());
			t.add(10);
			t.add(20);
			t.add(30);
			t.add(50);
			t.add(40);
			t.add(60);
			t.add(60);
			t.add(70);
			t.add(80);
			t.add(90);
			t.add(100);
			System.out.println(t);
		}
	}

}

