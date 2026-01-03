import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

 class Employee {
    private int id;
    private String name;
    private double salary;
    private String gender;
    private String city;
    private String department;

    public Employee(int id, String name, double salary, String gender, String city, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.city = city;
        this.department = department;
    }

    public int getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }


    public double getSalary()
    {
        return salary;
    }


    public String getGender()
    {
        return gender;
    }


    public String getCity()
    {
        return city;
    }

    public String getDepartment()
    {
        return department;
    }


}


public class EmployeeStreamOperation {
    public static void main(String args[])
    {

        List<Employee> emp = Arrays.asList(
                new Employee(1, "John Doe", 75000, "Male", "New York", "Engineering"),
                new Employee(2, "Jane Smith", 65000, "Female", "Chicago", "Marketing"),
                new Employee(3, "Mike Johnson", 85000, "Male", "New York", "Engineering")


        );


        List<Employee> list = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();

        System.out.println(list);

        double average = emp.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

        System.out.println(average);

        Map<String, Optional<Employee>> collect = emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect);

        Employee employee = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElseThrow();
        System.out.println(employee);
        Map<String, Optional<Employee>> collect1 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(),
                l -> l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst())));
        System.out.println(collect1);

        Optional<Map.Entry<Character, Long>> max = emp.stream()
                .map(n -> n.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max);


    }



}

