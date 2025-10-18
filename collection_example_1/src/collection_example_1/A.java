package collection_example_1;

import java.util.LinkedList;

public class A {
	
	public static void main(String[] args) {
		Employee e1= new Employee("brajesh" , "panda" , 123);
		Employee e2= new Employee("rajesh" , "panda" , 456);
		Employee e3= new Employee("bata" , "behera" , 789);
		
		LinkedList<Employee> l= new LinkedList<Employee>();
		l.add(e1);
		l.add(e3);
		l.add(e2);
		System.out.println(l);
		for (Employee employee : l) {
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getId());
		}
		
	}

}
