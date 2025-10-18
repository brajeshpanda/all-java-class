import java.util.Comparator;

public class A  implements Comparator<Student>{
	
	@Override

	public int compare(Student o1 , Student o2)
	{
		return o1.name.compareTo(o2.name);
	}
	
	public static void main(String[] args) {
		A a1= new A();
      int val = a1.compare(new Student(100, "brajesh"),new Student(200,"bp"));
		System.out.println(val);
	}

}
