import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

abstract class Employee {
	 
	 int id;
	 String EmployeeName;
	 int age;

    public static class EmployeeSalary {
        public static void main(String[] args) {


            List<Employee> employees = Arrays.asList(new Employee(23, "bp", 10000),
                                               new Employee(23, "Brajesh", 8000),
                                                new Employee(33, "rajesh",20000 ));

      List<Employee> data = employees.stream().filter(x -> x.getSalary()>1000).collect(Collectors.toList());

           for(Employee e: data){
               System.out.println(e.getId());
               System.out.println(e.getName());
               System.out.println(e.getSalary());
           }
        }
    }
}
	 
	 abstract class Department
	 {
		 int id;
		 String DepartmentName;

}
	 
	  class SoftwareEngineer extends Employee
	 {
		
	 }
	  class 
