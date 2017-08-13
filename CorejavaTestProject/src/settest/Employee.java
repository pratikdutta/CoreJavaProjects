package settest;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLatName(){
		return this.lastName;
	}
	
	
	@Override
	public int hashCode(){
		return 10;
	}
	
	@Override
	public boolean equals(Object o){
		Employee e = (Employee)o;
		if(e == null){
			return false;
		}
		if(e.getFirstName().equals(firstName)
				&& e.getLatName().equals(lastName)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
}
