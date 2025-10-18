package collection_example_1;

public class Employee {
	private String firstName;
	private String lastName;
	private int Id;
	
	Employee(String firstName ,String lastName , int Id)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.Id=Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	

}
